package com.itgaoshu.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Unit;
import com.itgaoshu.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("unit")
public class UnitController {
    @Autowired
    private UnitService unitService;
    /*
     * 查询计量单位
     * */
    @RequestMapping("/findAddUnit")
    @ResponseBody
    public Object findAddUnit(Unit unit, @RequestParam(defaultValue = "1",required = true) Integer Page, Integer limit ){
        PageHelper.startPage(Page,limit);
        List<Unit> list = unitService.findAddUnit(unit);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> tableData=new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    /*
     * 添加计量单位
     * */
    @RequestMapping("/addUnit")
    @ResponseBody
    public Object addUnit(Unit unit){
        int count = unitService.count(unit);
        if (count==0){
            int i = unitService.addUnit(unit);
            if (i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return unit.getUnitName()+"已存在";
        }
    }
    /*
    * 删除计量单位
    * */
    @RequestMapping("/deleteUnit")
    @ResponseBody
    public Object deleteUnit(Integer unitId){
        int i = unitService.delete(unitId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

}

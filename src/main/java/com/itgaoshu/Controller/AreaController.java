package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Area;
import com.itgaoshu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("area")
public class AreaController {

    @Autowired
    private AreaService areaService;
    /*
    * 查询生产地址
    * */
    @RequestMapping("/AreaList.do")
    @ResponseBody
    public Object AreaList(Area area, @RequestParam(defaultValue = "1",required = true) Integer page, Integer limit){
        PageHelper.startPage(page ,limit);
        List<Area> allArea = areaService.findAllArea(area);
        PageInfo pageInfo=new PageInfo(allArea);
        Map<String,Object> tableData=new HashMap<>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());

        return tableData;
    }
    /*
    * 添加生产地址
    * */
    @RequestMapping("/addArea.do")
    @ResponseBody
    public Object addArea(Area area){
        int count = areaService.count(area);
        if (count==0){
            int i = areaService.addArea(area);
            if(i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return area.getAreaName()+"已存在";
        }
    }
    /*
    * 删除
    * */
    @RequestMapping("/deleteArea.do")
    @ResponseBody
    public Object deleteArea(Integer areaId){
        int i = areaService.deleteArea(areaId);
        if (i==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}

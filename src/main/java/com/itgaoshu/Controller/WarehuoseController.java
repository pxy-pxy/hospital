package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Warehuose;
import com.itgaoshu.service.WarehuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("warehuos")
public class WarehuoseController {
    @Autowired
    private WarehuoseService warehuoseService;

    /*
     * 查询仓库
     * */
    @RequestMapping("/findAllWarehuose")
    @ResponseBody
    public Object findAllWarehuose(Warehuose warehuose ,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Warehuose> list = warehuoseService.findAllWarehuose(warehuose);
        PageInfo pageInfo =new PageInfo(list);
        Map<String,Object> tableData =new HashMap<String, Object>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());
        return tableData;

    }
    /*
     * 添加仓库
     * */
    @RequestMapping("/addWarehuose")
    @ResponseBody
    public  Object addWarehuose(Warehuose warehuose){
        int count = warehuoseService.count(warehuose);
        if (count==0){
            int i = warehuoseService.addWarehuose(warehuose);
            if (i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return warehuose.getSupplierName()+"已存在";
        }
    }
    /*
    * 删除仓库
    * */
    @RequestMapping("deleteWarehuose")
    @ResponseBody
    public Object deleteWarehuose(Integer warehouseId){
        int i = warehuoseService.deleteWarehuose(warehouseId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }


}

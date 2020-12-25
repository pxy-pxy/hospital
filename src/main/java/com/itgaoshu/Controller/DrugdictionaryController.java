package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Drugdictionary;
import com.itgaoshu.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("drugdictionary")
public class DrugdictionaryController {
    @Autowired
    private DrugdictionaryService drugdictionaryService;
    /*
    * 查询药品字典
    * */
    @RequestMapping("/findAllDrugdictionary")
    @ResponseBody
    public  Object findAllDrugdictionary(Drugdictionary drugdictionary, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugdictionary> list = drugdictionaryService.findAllDrugdictionary(drugdictionary);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
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
     * 添加药品
     * */
    @RequestMapping("/addDrugdictionary")
    @ResponseBody
    public Object addDrugdictionary(Drugdictionary drugdictionary){
        int count = drugdictionaryService.count(drugdictionary);
        if(count==0){
            int i = drugdictionaryService.addDrugdictionary(drugdictionary);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return drugdictionary.getDrugName()+"已存在";
        }

    }
    /*
     * 修改药品
     * */
    @RequestMapping("/editDrugdictionary")
    @ResponseBody
    public Object editDrugdictionary(Drugdictionary drugdictionary){
        int i = drugdictionaryService.editDrugdictionary(drugdictionary);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除药品
     * */
    @RequestMapping("/deleteDrugdictionary")
    @ResponseBody
    public Object deleteDrugdictionary(Integer drugId){
        int i = drugdictionaryService.deleteDrugdictionary(drugId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

}

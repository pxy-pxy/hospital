package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Registeredtype;
import com.itgaoshu.service.RegisteredTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("RegisteredType")
public class RegisteredTypeController {
    @Autowired
    private RegisteredTypeService registeredTypeService;
    //查询挂号类型
    @RequestMapping("/registeredTypeList")
    @ResponseBody
    public  Object registeredTypeList(Registeredtype registeredtype ,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Registeredtype> list = registeredTypeService.registeredTypeList(registeredtype);
        PageInfo pageInfo =new PageInfo(list);
        Map<String,Object> tableData=new HashMap<String, Object>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());

        return tableData;

    }
    //添加挂号类型
    @RequestMapping("addRegisteredType")
    @ResponseBody
    public Object addRegisteredType (Registeredtype registeredtype){
        int count = registeredTypeService.count(registeredtype);
        if (count==0){
            int i = registeredTypeService.addRegisteredType(registeredtype);
            if (i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return registeredtype.getType()+"已处在";
        }
    }
    //修改挂号类型
    @RequestMapping("editRegisteredType")
    @ResponseBody
    public Object editRegisteredType(Registeredtype registeredtype){
        int i = registeredTypeService.editRegisteredType(registeredtype);
        if (i==1){
            return "修改成功";
        }else {
            return "修改失败";
        }

    }
    //删除挂号类型
    @RequestMapping("deleteType")
    @ResponseBody
    public  Object deleteType (Integer registeredId){
        int i = registeredTypeService.deleteType(registeredId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }

    }




}

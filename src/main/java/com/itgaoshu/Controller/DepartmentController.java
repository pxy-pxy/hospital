package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Departments;
import com.itgaoshu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 科室中心
* */
@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    /*
    * 查询科室
    * */
    @RequestMapping("/departmentList")
    @ResponseBody
    public  Object departmentList(Departments departments, @RequestParam(defaultValue = "1",required = true) Integer Page, Integer limit){
        PageHelper.startPage(Page, limit);
        List<Departments> listAll = departmentService.departmentList(departments);
        PageInfo pageInfo = new PageInfo(listAll);
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
     * 添加科室
    */
    @RequestMapping("/addDepartment")
    @ResponseBody
    public Object  addDepartment(Departments departments){
        int con = departmentService.addDepartment(departments);
        if(con==0){
            int i = departmentService.addDepartment(departments);
            if (i==1){
                return "添加成功";
            }else {
                return "添加失败";            }
        }else {
            return departments.getDepartment()+"已存在";
        }

    }
    /*
    * 删除科室
    * */
    @RequestMapping("/delectDepartment")
    @ResponseBody
    public Object delectDepartment(Integer departmentId){
        int d = departmentService.delectDepartment(departmentId);
        if (d==1){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }




}

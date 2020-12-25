package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.*;
import com.itgaoshu.service.DepartmentService;
import com.itgaoshu.service.ProjectTypeService;
import com.itgaoshu.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ProjectType")
public class ProjectTypeController {
    @Autowired
    private ProjectTypeService projectTypeService;//项目类别
    @Autowired
    private DepartmentService departmentService;//科室
    @Autowired
    private UnitService unitService;//计量
    /*
     * 查询生产项目大类
     * */
    @RequestMapping("/findAllProjecttype")
    @ResponseBody
    public Object findAllProjecttype(ProjectType projectType, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<ProjectType> list = projectTypeService.findAllProjecttype(projectType);
        PageInfo pageInfo=new PageInfo(list);
        Map<String ,Object> tableData=new HashMap<>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());

        return tableData;
    }
    /*
     * 添加生产项目大类
     * */
    @RequestMapping("/addProjecttype")
    @ResponseBody
    private Object addProjecttype(ProjectType projectType){
        int c = projectTypeService.count1(projectType);
        if (c==0){
            int i = projectTypeService.addProjecttype(projectType);
            if (i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return projectType.getProjectName()+"已存在";
        }
    }
    /*
    * 删除生产项目大类
    * */
    @RequestMapping("/deleteProjecttype")
    @ResponseBody
    public Object deleteProjecttype(Integer projectId){
        int i = projectTypeService.delectProjecttype(projectId);
        if (i==1){
            return "删除成功";
        }else {
            return "删除失败";
        }

    }
    /*
    * 查询门诊收费项目
    * */
    @RequestMapping("/findAllOutpatienttype")
    @ResponseBody
    public Object findAllOutpatienttype(Outpatienttype outpatienttype, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Outpatienttype> list = projectTypeService.findAllOutpatienttype(outpatienttype);
        PageInfo pageInfo =new PageInfo(list);
        Map<String, Object> tableData =new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }

    //查询计量单位
    @RequestMapping("/UnitList")
    @ResponseBody
    public Object UnitList(){
        List<Unit> list = unitService.findAddUnit(null);
        return list;
    }
    //查询项目类别
    @RequestMapping("/findAllProjecttype1")
    @ResponseBody
    public Object findAllOutpatienttype(){
        List<ProjectType> list = projectTypeService.findAllProjecttype(null);
        return list;
    }
    /*
     * 添加门诊收费项
     */
    @RequestMapping("/addOutpatienttype")
    @ResponseBody
    public Object addOutpatienttype(Outpatienttype outpatienttype, Integer projectId, Integer unitId){
        outpatienttype.setBigprojectId(projectId);
        outpatienttype.setUnit(unitId);
        int count2 = projectTypeService.count2(outpatienttype);
        if (count2==0){
            int i = projectTypeService.addOutpatienttype(outpatienttype);
            if(i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return outpatienttype.getProjectName()+"已存在";
        }
    }
    //修改门诊收费项
    @RequestMapping("/editOutpatienttype")
    @ResponseBody
    public Object editOutpatienttype(Outpatienttype outpatienttype,Integer prepareId ,Integer unitId){
        outpatienttype.setBigprojectId(prepareId);
        outpatienttype.setUnit(unitId);
        int i = projectTypeService.editOutpatienttype(outpatienttype);
        if (i==1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
    //删除门诊收费项
    @RequestMapping("/deleteOutpatienttype")
    @ResponseBody
    public Object deleteOutpatienttype(Integer outpatientId){
        int i = projectTypeService.deleteOutpatienttype(outpatientId);
        if(i==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    /*
     * 住院收费项
     *
     * */
    @RequestMapping("/findAllInoutpatienttype")
    @ResponseBody
    public Object findAllInoutpatienttype(Inoutpatienttype inoutpatienttype,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Inoutpatienttype> list = projectTypeService.findAllInoutpatienttype(inoutpatienttype);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> tableData=new HashMap<>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());
        return tableData;
    }
    //查询计量单位
    @RequestMapping("/UnitList1")
    @ResponseBody
    public Object UnitList1(){
        List<Unit> list = unitService.findAddUnit(null);
        return list;
    }
    //查询项目类别
    @RequestMapping("/findAllProjecttype2")
    @ResponseBody
    public Object findAllOutpatienttype1(){
        List<ProjectType> list = projectTypeService.findAllProjecttype(null);
        return list;
    }
    /*
     * 添加住院收费项
     */
    @RequestMapping("/addInoutpatienttype")
    @ResponseBody
    public Object addInoutpatienttype(Outpatienttype outpatienttype, Integer projectId, Integer unitId){
        outpatienttype.setBigprojectId(projectId);
        outpatienttype.setUnit(unitId);
        int count2 = projectTypeService.count2(outpatienttype);
        if (count2==0){
            int i = projectTypeService.addOutpatienttype(outpatienttype);
            if(i==1){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }else {
            return outpatienttype.getProjectName()+"已存在";
        }
    }
    //修改住院收费项
    @RequestMapping("/editInoutpatienttype")
    @ResponseBody
    public Object editInoutpatienttype(Outpatienttype outpatienttype,Integer prepareId ,Integer unitId){
        outpatienttype.setBigprojectId(prepareId);
        outpatienttype.setUnit(unitId);
        int i = projectTypeService.editOutpatienttype(outpatienttype);
        if (i==1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
    //删除住院收费项
    @RequestMapping("/deleteInoutpatienttype")
    @ResponseBody
    public Object deleteInoutpatienttype(Integer outpatientId){
        int i = projectTypeService.deleteOutpatienttype(outpatientId);
        if(i==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    /*
     * 查询收费类型
     * */
    @RequestMapping("/findAllMoneytype")
    @ResponseBody
    public Object findAllMoneytype(Moneytype moneytype, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Moneytype> listAll = projectTypeService.findAllMoneytype(moneytype);
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
     * 添加收费类型
     * */
    @RequestMapping("/addMoneytype")
    @ResponseBody
    public Object addMoneytype(Moneytype moneytype){
        int i1 = projectTypeService.count5(moneytype);
        if(i1==0){
            int i = projectTypeService.addMoneytype(moneytype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return moneytype.getMoneytype()+"已存在";
        }

    }
    /*
     * 修改收费类型
     * */
    @RequestMapping("/editMoneytype")
    @ResponseBody
    public Object editMoneytype(Moneytype moneytype){
        int i = projectTypeService.editMoneytype(moneytype);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除收费类型
     * */
    @RequestMapping("/deleteMoneytype")
    @ResponseBody
    public Object deleteMoneytype(Integer moneyId){
        int i = projectTypeService.deleteMoneytype(moneyId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    /*
     * 查询床位
     * */
    @RequestMapping("/findAllBed")
    @ResponseBody
    public Object findAllBed(Bed bed, Integer page, Integer limit){
        System.out.println(bed.getBedname());
        PageHelper.startPage(page, limit);
        List<Bed> listAll = projectTypeService.findAllBed(bed);
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
     * 添加床位
     * */
    @RequestMapping("/addBed")
    @ResponseBody
    public Object addBed(Bed bed){

        int i1 = projectTypeService.count4(bed);
        if(i1==0){
            int i = projectTypeService.addBed(bed);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return bed.getBedname()+"已存在";
        }

    }
    /*
     * 修改床位
     * */
    @RequestMapping("/editBed")
    @ResponseBody
    public Object editBed(Bed bed){

        int i = projectTypeService.editBed(bed);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }


    /*
     * 删除床位
     * */
    @RequestMapping("/deleteBed")
    @ResponseBody
    public Object deleteBed(Integer bedId){
        int i1 = projectTypeService.checkCount(bedId);
        if(i1==1){
            return "该床位还有病人" ;
        }else {
            int i = projectTypeService.deleteBed(bedId);
            if(i==1){
                return "删除成功";
            }else{
                return "删除失败";
            }
        }

    }


    /*
     * 查询科室
     * */
    @RequestMapping("/departmentList")
    @ResponseBody
    public Object DepartmentList(){
        List<Departments> listAll = departmentService.departmentList(null);
        return listAll;
    }


}

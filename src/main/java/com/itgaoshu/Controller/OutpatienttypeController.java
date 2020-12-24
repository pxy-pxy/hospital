package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Cashier;
import com.itgaoshu.bean.Outpatienttype;
import com.itgaoshu.bean.Pharmacy;
import com.itgaoshu.bean.ReportVo;
import com.itgaoshu.service.OutpatienttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tan
 * @create 2020-12-23 10:27
 */
@Controller
@RequestMapping("caoout")
public class OutpatienttypeController {
    @Autowired
    private OutpatienttypeService outpatienttypeService;
    //进入处方划价页面
    @RequestMapping("xiang")
    public Object xiang(Model model){
        return  "cao/Cxiangmu";
    }
    //进入收费页面//药品缴费
    @RequestMapping("out")
    public Object look(Model model){
        return  "cao/Ctoll";
    }
    //查询药品所有信息
    @RequestMapping("selout")
    @ResponseBody
    public Object seldrug(Outpatienttype outpatienttype, Integer page, Integer limit, String projectName){
        outpatienttype.setProjectName(projectName);
        PageHelper.startPage(page, limit);
        List<Pharmacy> selout = outpatienttypeService.selout(outpatienttype);
        PageInfo pageInfo = new PageInfo(selout);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询处方中是否有这个药
    @RequestMapping("selchuo")
    @ResponseBody
    public Object seslchuo(Cashier cashier, Integer reid, String mename){
        cashier.setReportId(reid);//把用户id存入数据库
        cashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = outpatienttypeService.selchuo(cashier);
        return selcadr;
    }
    //添加处方药品
    @RequestMapping("addchuo")
    @ResponseBody
    public Object addchuo(Cashier cashier,Integer ostate){
        System.out.println(123);
        System.out.println(ostate);
        cashier.setOstate(ostate);
        System.out.println(cashier.getOstate());
        //向处方添加药品
        Integer addchuo = outpatienttypeService.addchuo(cashier);
        return addchuo;
    }
    //如果处方中有该药品则修改该药品的数量和价钱
    @RequestMapping("updchuo")
    @ResponseBody
    public Object updchuo(Cashier cashier,Pharmacy pharmacy){
        //修改处方中药品的数量
        Integer updchuo = outpatienttypeService.updchuo(cashier);
        String pharmacyName=cashier.getDurgname();
        pharmacy.setPharmacyName(pharmacyName);
        return updchuo;
    }
    //删除处方中的药品
    @RequestMapping("delo")
    @ResponseBody
    public Object delchuo(Cashier cashier){
        Integer del = outpatienttypeService.delchuo(cashier);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    //查询处方的总价钱
    @RequestMapping("selch")
    @ResponseBody
    public Object selch(Cashier cashier){
        Double selch = outpatienttypeService.selch(cashier);
        return selch;
    }
    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(ReportVo reportVo){
        Integer shoufei = outpatienttypeService.shoufei(reportVo);
        //把挂号费添加到收费表上
        Integer guafei = outpatienttypeService.guafei(reportVo);
        return  shoufei;
    }
}

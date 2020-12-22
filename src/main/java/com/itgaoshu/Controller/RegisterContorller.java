package com.itgaoshu.Controller;

import com.itgaoshu.bean.*;
import com.itgaoshu.service.ReportService;
import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-21 15:38
 */
@Controller
@RequestMapping("RC")
public class RegisterContorller {
    private ReportService reportService;
    //查询所有数据
    @RequestMapping("index")
    public Object report(ReportVo reportVo , Model model, Integer cc, String parms, HttpServletRequest request) {
        reportVo.setCc(cc);
        HttpSession session = request.getSession();
        //将数据存放在session中
        session.setAttribute("ban", cc);
         reportService.upddang();
         String reportName=parms;
         reportVo.setReportName(reportName);
         List<ReportVo> sel= reportService.sel(reportVo);
         model.addAttribute("report",sel);
         return "cao/report";
    }
    //查询所有科室//sel=select - dep=deprtments
    @RequestMapping("seldep")
    @ResponseBody
    public Object seldep(){
        List<Departments> seldep=reportService.seldep();
        return  seldep;
    }
    //查询所有挂号的类型//sel=select - reg=Registeredtype
    @RequestMapping("selreg")
    @ResponseBody
    public Object selreg(){
        List<Registeredtype> selreg=reportService.selreg();
        return selreg;
    }
    //查询所有医生
    @RequestMapping("seldoctor")
    @ResponseBody
    public Object seldocter(Doctor doctor){
       Calendar calendar= Calendar.getInstance();
       Integer data=calendar.get(Calendar.DAY_OF_WEEK)-1;//获取当前是星期几
        if(data==1){
            List<ReportVo> one = reportService.one(doctor);
            return one;
        }else if(data==2){
            List<ReportVo> two = reportService.two(doctor);
            return two;
        }else if(data==3){
            List<ReportVo> three = reportService.three(doctor);
            return three;
        }else if(data==4){
            List<ReportVo> four = reportService.four(doctor);
            return four;
        }else if(data==5){
            List<ReportVo> five = reportService.five(doctor);
            return five;
        }else if(data==6){
            List<ReportVo> six = reportService.six(doctor);
            return six;
        }else{
            List<ReportVo> seven = reportService.seven(doctor);
            return seven;
        }
    }
    //根据挂号类型查找该类型的价格//sel=select - ty=type - mo=moneytype
    @RequestMapping("seltymo")
    @ResponseBody
    public Object seltymo(Registeredtype registeredtype){
        Integer seltymo = reportService.seltymo(registeredtype);
        return seltymo;
    }
    //添加新的挂号//add=添加 - re=register
    @RequestMapping("addre")
    @ResponseBody
    public Object addre(Report report){
        int addre = reportService.addre(report);
        if(addre==1){
            return "添加成功";
        }else{
            return "添加失败，请检查信息是否正确";
        }
    }
    //根据id删除挂号人
    @RequestMapping("selById")
    @ResponseBody
    public Object selById(Integer reportId){
        List<ReportVo> reportVos=reportService.selById(reportId);
        return reportVos;
    }
    //判断就诊用户电话身份证号唯一
    @RequestMapping("phone")
    @ResponseBody
    public Object phone(Report rport){
        int carid = reportService.carid(rport);
        int phone = reportService.phone(rport);
        if(carid>=1){
            return 2;
        }else if(phone>=1){
            return 1;
        }else{
            return 3;
        }
    }
    //转入住院部
    @RequestMapping("zhuanyuan")
    @ResponseBody
    public Object zhuanyuan(Integer id,Report report,String zhuan){
        report.setReportId(id);
        report.setZhuan(zhuan);
        Integer zhuanyuan = reportService.zhuanyuan(report);
        return zhuanyuan;
    }
}

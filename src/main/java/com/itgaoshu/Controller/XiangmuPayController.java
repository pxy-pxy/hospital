package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Cashier;
import com.itgaoshu.service.XiangmuPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tan
 * @create 2020-12-23 17:20
 */
@Controller
@RequestMapping("xpay")
public class XiangmuPayController {
    @Autowired
    private XiangmuPayService xiangmuPayService;
    //进入项目收费页面
    @RequestMapping("xiangpay")
    public String xiangpay(){
        return "cao/xaingmupay";
    }
    //选择患者后对该患者的项目进行查询
    @RequestMapping("selxiang")
    @ResponseBody
    public Object selxiang(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> mohu = xiangmuPayService.selxiang(perid);
        PageInfo pageInfo = new PageInfo(mohu);
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
    //点击确认收费前确定该患者有没有收费项目
    @RequestMapping("selshoux")
    @ResponseBody
    public Object selshoux(Integer perid){
        Integer selshoux = xiangmuPayService.selshoux(perid);
        return  selshoux;
    }
    //项目缴费修改项目的收费状态
    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(Integer perid){
        Integer updxiang = xiangmuPayService.updxiang(perid);
        return updxiang;
    }
    //进入项目检查页面
    @RequestMapping("seljian")
    public Object seljian(){
        return "cao/jiancha";
    }
    //查询该用户的所有要检查的项目
    @RequestMapping("selcha")
    @ResponseBody
    public Object selcha(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> selcha = xiangmuPayService.selcha(perid);
        PageInfo pageInfo = new PageInfo(selcha);
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
    //添加用户项目的检查结果
    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Cashier cashier,Integer reid,String bing,Integer ccashier){
        cashier.setReportId(reid);
        cashier.setJie(bing);
        cashier.setCashier(ccashier);
        Integer addjie = xiangmuPayService.addjie(cashier);
        return addjie;
    }
}

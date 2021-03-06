package com.itgaoshu.service;

import com.itgaoshu.bean.Cashier;
import com.itgaoshu.bean.Outpatienttype;
import com.itgaoshu.bean.Pharmacy;
import com.itgaoshu.bean.ReportVo;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 10:28
 */
public interface OutpatienttypeService {
    //查询门诊收费项目
    List<Pharmacy> selout(Outpatienttype outpatienttype);
    //查询这个用户的处方表上有没有这个药
    Integer selchuo(Cashier cashier);
    //添加处方药品
    Integer addchuo(Cashier cashier);
    //如果有该项目则改变该项目的数量
    Integer updchuo(Cashier cashier);
    //删除处方中的项目
    Integer delchuo(Cashier cashier);
    //查询这个用户的处方的价钱
    Double selch(Cashier cashier);
    //修改用户信息  付过钱了
    Integer shoufei(ReportVo reportVo);
    //把挂号费添加到收费表上
    Integer guafei(ReportVo reportVo);
}

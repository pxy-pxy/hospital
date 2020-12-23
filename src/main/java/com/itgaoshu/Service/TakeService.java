package com.itgaoshu.service;

import com.itgaoshu.bean.ReportVo;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 18:47
 */
public interface TakeService {
    //查询挂号人的所有信息用于页面展示
    List<ReportVo> sel();
    //药品出库修改用户状态
    Integer chuku(ReportVo reportVo);
    //查看所有交费出院的患者
    List<ReportVo> selhuan(ReportVo reportVo);
    //查询该用户的总价钱
    int zong(Integer reid);
}

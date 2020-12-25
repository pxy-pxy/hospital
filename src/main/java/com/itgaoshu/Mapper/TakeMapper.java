package com.itgaoshu.Mapper;

import com.itgaoshu.bean.ReportVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 18:44
 */
@Mapper
public interface TakeMapper {
    //查询挂号的所有信息用于页面展示
    List<ReportVo> sel();
    //药品出库修改用户状态
    Integer chuku(ReportVo reportVo);
    //查看所有交费出院的患者
    List<ReportVo> selhuan(ReportVo reportVo);
    //查询该用户的总价钱
    int zong(Integer reid);
}

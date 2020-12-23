package com.itgaoshu.mapper;

import com.itgaoshu.bean.Cashier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 17:07
 */
@Mapper
public interface XiangmuPayMapper {
    //查询用户所有的项目
    List<Cashier> selxiang(Integer perid);
    //查询该用户有没有收费项目
    Integer selshoux(Integer perid);
    //项目收费修改项目的收费状态
    Integer updxiang(Integer perid);
    //项目检查页面查询用户所有要检查的项目
    List<Cashier> selcha(Integer perid);
    //添加项目的检查结果
    Integer addjie(Cashier cashier);
}

package com.itgaoshu.mapper;

import com.itgaoshu.bean.Cashier;
import com.itgaoshu.bean.Outpatienttype;
import com.itgaoshu.bean.Pharmacy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 10:27
 */
@Mapper
public interface OutpatienttypeMapper {
    //查询门诊收费项目
    List<Pharmacy> selout(Outpatienttype outpatienttype);
    //查询当前用户的处方表上有没有这个药
    Integer selchuo(Cashier cashier);
    //添加处方项目
    Integer addchuo(Cashier cashier);
    //如果有该项目则改变该项目的数量
    Integer updchuo(Cashier cashier);
    //删除处方中的项目
    Integer delchuo(Cashier cashier);
}

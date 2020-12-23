package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Unit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UnitMapper {
    /*
     * 计量单位增删改查
     * */

    List<Unit> findAddUnit(Unit unit);
    int addUnit(Unit unit);
    int delete(Integer unitId);
    int count(Unit unit);
}

package com.itgaoshu.service;

import com.itgaoshu.bean.Unit;

import java.util.List;

public interface UnitService {
    /*
    * 计量单位增删改查
    * */
    List<Unit>  findAddUnit(Unit unit);
    int addUnit(Unit unit);
    int delete(Integer unitId);
    int count(Unit unit);

}

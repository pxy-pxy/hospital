package com.itgaoshu.service;

import com.itgaoshu.bean.Area;

import java.util.List;

public interface AreaService {
    //寻找所有产地
    List<Area> findAllArea(Area area);
    //删除
    int deleteArea(Integer areaId);
    //添加
    int addArea(Area area);
    //查询数目
    int count(String name);
}

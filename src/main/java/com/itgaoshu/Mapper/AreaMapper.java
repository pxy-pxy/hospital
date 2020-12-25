package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaMapper {
    //寻找所有产地
    List<Area> findAllArea(Area area);
    //删除
    int deleteArea(Integer areaId);
    //添加
    int addArea(Area area);
    //查询数目
    int count(Area area);
}

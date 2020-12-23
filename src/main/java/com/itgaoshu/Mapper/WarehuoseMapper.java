package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Warehuose;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehuoseMapper {
    //库房增删查
    public List<Warehuose> findAllWarehuose(Warehuose warehuose);
    public int  addWarehuose(Warehuose warehuose);
    public int  deleteWarehuose(Integer warehouseId);
    public int  count(Warehuose warehuose);
}

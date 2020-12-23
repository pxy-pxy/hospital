package com.itgaoshu.dao;

import com.itgaoshu.bean.Registeredtype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisteredTypeMapper {
    //挂号类型增删改查
    List<Registeredtype> registeredTypeList(Registeredtype registeredtype);
    public  int addRegisteredType(Registeredtype registeredtype);
    public  int deleteType(Integer registeredId);
    public  int editRegisteredType(Registeredtype registeredtype);
    public  int  count(Registeredtype registeredtype);


}

package com.itgaoshu.service;

import com.itgaoshu.bean.Registeredtype;

import java.util.List;

public interface RegisteredTypeService {
    //挂号类型增删改查
    List<Registeredtype> registeredTypeList(Registeredtype registeredtype);
    public  int addRegisteredType(Registeredtype registeredtype);
    public  int deleteType(Integer registeredId);
    public  int editRegisteredType(Registeredtype registeredtype);
    public  int  count(Registeredtype registeredtype);

}

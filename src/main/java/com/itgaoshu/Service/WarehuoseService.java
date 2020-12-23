package com.itgaoshu.service;

import com.itgaoshu.bean.Warehuose;

import java.util.List;

public interface WarehuoseService {
    //库房增删查
    public List<Warehuose> findAllWarehuose(Warehuose warehuose);
    public int  addWarehuose(Warehuose warehuose);
    public int  deleteWarehuose(Integer warehouseId);
    public int  count(Warehuose warehuose);
}

package com.itgaoshu.service;

import com.itgaoshu.bean.Upplier;

import java.util.List;

public interface UpplierService {
    /*
  供货单位增删改查
  * */
    List<Upplier> findAllUpplier(Upplier upplier);
    int addUpplier(Upplier upplier);
    int deleteUpplier(Integer  supplierId);
    int count(Upplier upplier);
}

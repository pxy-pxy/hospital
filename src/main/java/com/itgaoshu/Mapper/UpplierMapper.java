package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Upplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UpplierMapper {
    /*
   供货单位增删改查
   * */
    List<Upplier> findAllUpplier(Upplier upplier);
    int addUpplier(Upplier upplier);
    int deleteUpplier(Integer  supplierId);
    int count(Upplier upplier);

}

package com.itgaoshu.mapper;


import com.itgaoshu.bean.Paiban;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MainMapper {
    @Select("  select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.one  != '无班' and d.dstate!=3")
    List<Paiban> one();
    @Select(" select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.two  != '无班' and d.dstate!=3")
    List<Paiban> two();
    @Select("select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.three  != '无班' and d.dstate!=3")
    List<Paiban> three();
    @Select("select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.four  != '无班' and d.dstate!=3")
    List<Paiban> four();
    @Select("select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.five  != '无班' and d.dstate!=3")
    List<Paiban> five();
    @Select("select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.six  != '无班' and d.dstate!=3")
    List<Paiban> six();
    @Select(" select d.doctorName doctorName,d.doctorId from doctor d, paiban p where d.doctorId=p.doctorId and p.seven  != '无班' and d.dstate!=3")
    List<Paiban> seven();
    @Select(" select count(*) from report where DATE_FORMAT(time,'%Y-%m-%d')=DATE_FORMAT(SYSDATE(),'%Y-%m-%d') and  state!=0")
    int currentNum();
    @Select("SELECT count(*) FROM report where state!=0")
    int Total();
    @Select("  select count(*) from register  where state!=0")
    int zhuyuanTotal();
    @Select("SELECT count(*) FROM register where DATE_FORMAT(registerDate,'%Y-%m-%d')=DATE_FORMAT(NOW(),'%Y-%m-%d')")
    int currentZhuYuan();

}

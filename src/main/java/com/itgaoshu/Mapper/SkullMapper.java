package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Skull;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkullMapper {
//    经办人增删改查
    List<Skull> findAllSkull(Skull skull);
    int addSkull(Skull skull);
    int deleteSkull(Integer skullId);
    int editSkull(Skull skull);

}

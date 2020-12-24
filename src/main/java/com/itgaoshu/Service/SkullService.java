package com.itgaoshu.service;

import com.itgaoshu.bean.Skull;

import java.util.List;

public interface SkullService {
    //    经办人增删改查
    List<Skull> findAllSkull(Skull skull);
    int addSkull(Skull skull);
    int deleteSkull(Integer skullId);
    int editSkull(Skull skull);
}

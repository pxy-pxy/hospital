package com.itgaoshu.dao;

import com.itgaoshu.bean.Checkup;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 9:24
 */
public interface CheckupMapper {
    int addCheckup(Checkup checkup);
    int updPrice(Checkup checkup);
    List<Checkup> selCheckup(Checkup checkup);
}

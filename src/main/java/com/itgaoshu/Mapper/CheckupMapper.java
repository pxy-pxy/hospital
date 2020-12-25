package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Checkup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 9:24
 */
@Mapper
public interface CheckupMapper {
    int addCheckup(Checkup checkup);
    int updPrice(Checkup checkup);
    List<Checkup> selCheckup(Checkup checkup);
}

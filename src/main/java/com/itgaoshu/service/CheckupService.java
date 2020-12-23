package com.itgaoshu.service;

import com.itgaoshu.bean.Checkup;

import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 9:25
 */
public interface CheckupService {
      //添加检查结果
      int addCheckup(Checkup checkup);

      int updPrice(Checkup checkup);
      //查询患者检查结果
      List<Checkup> selCheckup(Checkup checkup);
}

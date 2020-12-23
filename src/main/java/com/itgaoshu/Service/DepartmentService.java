package com.itgaoshu.service;


import com.itgaoshu.bean.Departments;

import java.util.List;

public interface DepartmentService {
    //科室查询
    public List<Departments> departmentList(Departments departments);
    //科室添加
    public int addDepartment(Departments departments);
    //科室删除
    public int  delectDepartment(Integer departmentId);
    //查询数目
    public int count(Departments departments);
    //判断该科室是否还有医生
    public int checkCount(Integer departmentId);

}

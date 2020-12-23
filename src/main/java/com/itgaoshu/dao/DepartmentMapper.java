package com.itgaoshu.dao;

import com.itgaoshu.bean.Departments;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    //科室查询
    public List<Departments> departmentList(Departments departments);
    //科室添加
    @Insert(" insert into departments(department)values(#{department})")
    public int addDepartment(Departments departments);
    //科室删除
    @Delete("update departments set ddstate=1  where departmentId=#{departmentId}")
    public int  delectDepartment(Integer departmentId);
    //查询数目
    @Select("select count(*) from departments where department = #{department}")
    public int count(Departments departments);
    //判断该科室是否还有医生
    public int checkCount(Integer departmentId);


}

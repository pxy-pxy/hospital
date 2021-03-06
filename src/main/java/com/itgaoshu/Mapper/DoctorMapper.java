package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Departments;
import com.itgaoshu.bean.Doctor;
import com.itgaoshu.bean.Registeredtype;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DoctorMapper {
    //查询医生
    public List<Doctor> doctorList(@Param("registeredid") Doctor doctor);
    //删除
    public int deleteDoctor(Integer doctorId);
    //添加
    public int addDoctor(Doctor doctor);
    //修改
    public int editDoctor(Doctor doctor);
    //数量
    public int count(Doctor doctor);
    public List<Departments> findAllDepartments();
    public List<Registeredtype>findAllRegisteredtype();
    /*
     * 判断该医生是否还有病人
     * */
    int checkCount(Integer doctorId);
}

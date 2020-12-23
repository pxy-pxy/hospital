package com.itgaoshu.service;

import com.itgaoshu.bean.Departments;
import com.itgaoshu.bean.Doctor;
import com.itgaoshu.bean.Registeredtype;

import java.util.List;

public interface DoctorService {
    //查询医生
    public List<Doctor> doctorList(Doctor doctor);
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

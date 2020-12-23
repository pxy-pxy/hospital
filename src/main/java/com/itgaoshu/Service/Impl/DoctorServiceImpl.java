package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Departments;
import com.itgaoshu.bean.Doctor;
import com.itgaoshu.bean.Registeredtype;
import com.itgaoshu.dao.DoctorMapper;
import com.itgaoshu.service.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {


    private DoctorMapper doctorMapper;
    @Override
    public List<Doctor> doctorList(Doctor doctor) {

        return doctorMapper.doctorList(doctor);
    }

    @Override
    public int deleteDoctor(Integer doctorId) {
        return doctorMapper.deleteDoctor(doctorId);
    }

    @Override
    public int addDoctor(Doctor doctor) {
        return doctorMapper.addDoctor(doctor);
    }

    @Override
    public int editDoctor(Doctor doctor) {
        return doctorMapper.editDoctor(doctor);
    }

    @Override
    public int count(Doctor doctor) {
        return doctorMapper.count(doctor);
    }

    @Override
    public List<Departments> findAllDepartments() {
        return doctorMapper.findAllDepartments();
    }

    @Override
    public List<Registeredtype> findAllRegisteredtype() {
        return doctorMapper.findAllRegisteredtype();
    }

    @Override
    public int checkCount(Integer doctorId) {
        return doctorMapper.checkCount(doctorId);
    }
}

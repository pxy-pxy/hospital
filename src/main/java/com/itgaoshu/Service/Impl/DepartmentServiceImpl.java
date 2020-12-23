package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Departments;
import com.itgaoshu.Mapper.DepartmentMapper;
import com.itgaoshu.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Departments> departmentList(Departments departments) {
        return departmentMapper.departmentList(departments);
    }

    @Override
    public int addDepartment(Departments departments) {
        return departmentMapper.addDepartment(departments);
    }

    @Override
    public int delectDepartment(Integer departmentId) {
        return departmentMapper.delectDepartment(departmentId);
    }

    @Override
    public int count(Departments departments) {
        return departmentMapper.count(departments);
    }

    @Override
    public int checkCount(Integer departmentId) {
        return departmentMapper.checkCount(departmentId);
    }
}

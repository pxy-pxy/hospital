package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.*;
import com.itgaoshu.Mapper.ProjectTypeMapper;
import com.itgaoshu.service.ProjectTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProjectTypeServiceImpl implements ProjectTypeService {
    @Resource
    private ProjectTypeMapper projectTypeMapper;

    @Override
    public List<ProjectType> findAllProjecttype(ProjectType projectType) {
        return projectTypeMapper.findAllProjecttype(projectType);
    }

    @Override
    public int addProjecttype(ProjectType projectType) {
        return projectTypeMapper.addProjecttype(projectType);
    }

    @Override
    public int delectProjecttype(Integer projectId) {
        return projectTypeMapper.delectProjecttype(projectId);
    }

    @Override
    public int count1(ProjectType projectType) {
        return projectTypeMapper.count1(projectType);
    }

    @Override
    public List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.findAllOutpatienttype(outpatienttype);
    }

    @Override
    public int addOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.addOutpatienttype(outpatienttype);
    }

    @Override
    public int editOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.editOutpatienttype(outpatienttype);
    }

    @Override
    public int deleteOutpatienttype(Integer outpatientId) {
        return projectTypeMapper.delectProjecttype(outpatientId);
    }

    @Override
    public int count2(Outpatienttype outpatienttype) {
        return projectTypeMapper.count2(outpatienttype);
    }

    @Override
    public List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projectTypeMapper.findAllInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int addInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projectTypeMapper.addInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int editInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projectTypeMapper.editInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int deleteInoutpatienttype(Integer inoutpatientId) {
        return projectTypeMapper.deleteInoutpatienttype(inoutpatientId);
    }

    @Override
    public int count3(Inoutpatienttype inoutpatienttype) {
        return projectTypeMapper.count3(inoutpatienttype);
    }

    @Override
    public List<Bed> findAllBed(Bed bed) {
        return projectTypeMapper.findAllBed(bed);
    }

    @Override
    public int addBed(Bed bed) {
        return projectTypeMapper.addBed(bed);
    }

    @Override
    public int editBed(Bed bed) {
        return projectTypeMapper.editBed(bed);
    }

    @Override
    public int deleteBed(Integer bedId) {
        return projectTypeMapper.deleteBed(bedId);
    }

    @Override
    public int count4(Bed bed) {
        return projectTypeMapper.count4(bed);
    }

    @Override
    public List<Moneytype> findAllMoneytype(Moneytype moneytype) {
        return projectTypeMapper.findAllMoneytype(moneytype);
    }

    @Override
    public int addMoneytype(Moneytype moneytype) {
        return projectTypeMapper.addMoneytype(moneytype);
    }

    @Override
    public int editMoneytype(Moneytype moneytype) {
        return projectTypeMapper.editMoneytype(moneytype);
    }

    @Override
    public int deleteMoneytype(Integer moneyId) {
        return projectTypeMapper.deleteMoneytype(moneyId);
    }

    @Override
    public int count5(Moneytype moneytype) {
        return projectTypeMapper.count5(moneytype);
    }

    @Override
    public int checkCount(Integer bedId) {
        return projectTypeMapper.checkCount(bedId);
    }
}

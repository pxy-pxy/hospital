package com.itgaoshu.service;

import com.itgaoshu.bean.*;

import java.util.List;

public interface ProjectTypeService {
    /*
    * 项目
    * */
    List<ProjectType> findAllProjecttype(ProjectType projectType);
    int addProjecttype(ProjectType projectType);
    int delectProjecttype(Integer projectId);
    int count1 (ProjectType projectType);
    /*
     * 门诊收费项目
     * */
     List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype);
     int addOutpatienttype(Outpatienttype outpatienttype);
     int editOutpatienttype(Outpatienttype outpatienttype);//编辑
     int deleteOutpatienttype(Integer outpatientId);
     int count2(Outpatienttype outpatienttype);
    /*
     *住院收费项目
     * */
    List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype);
    int addInoutpatienttype(Inoutpatienttype inoutpatienttype);
    int editInoutpatienttype(Inoutpatienttype inoutpatienttype);//编辑
    int deleteInoutpatienttype(Integer inoutpatientId);
    int count3(Inoutpatienttype inoutpatienttype);
    /*
     * 住院床位
     * */
    List<Bed> findAllBed(Bed bed);
    int addBed(Bed bed);
    int editBed(Bed bed);
    int deleteBed(Integer bedId);
    int count4(Bed bed);
    /*
     *收费项目
     * */
    List<Moneytype> findAllMoneytype(Moneytype moneytype);
    int addMoneytype(Moneytype moneytype);
    int editMoneytype(Moneytype moneytype);
    int deleteMoneytype(Integer moneyId);
    int count5(Moneytype moneytype);
    /*
    * 判断床位是否有病人
    * */
    int checkCount(Integer bedId);

}

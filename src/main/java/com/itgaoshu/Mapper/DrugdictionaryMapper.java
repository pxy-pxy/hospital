package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Drugdictionary;

import java.util.List;

public interface DrugdictionaryMapper {
    //药品字典的增删改查
    List<Drugdictionary> findAllDrugdictionary(Drugdictionary drugdictionary);
    int addDrugdictionary(Drugdictionary drugdictionary);
    int editDrugdictionary(Drugdictionary drugdictionary);
    int deleteDrugdictionary(Integer drugId);
    int count(Drugdictionary drugdictionary);
}

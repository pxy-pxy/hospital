package com.itgaoshu.service.Impl;

import com.itgaoshu.Mapper.DrugdictionaryMapper;
import com.itgaoshu.bean.Drugdictionary;
import com.itgaoshu.service.DrugdictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DrugdictionaryServiceImpl implements DrugdictionaryService {
    @Resource
    private DrugdictionaryMapper drugdictionaryMapper;

    @Override
    public List<Drugdictionary> findAllDrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.findAllDrugdictionary(drugdictionary);
    }

    @Override
    public int addDrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.addDrugdictionary(drugdictionary);
    }

    @Override
    public int editDrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.editDrugdictionary(drugdictionary);
    }

    @Override
    public int deleteDrugdictionary(Integer drugId) {
        return drugdictionaryMapper.deleteDrugdictionary(drugId);
    }

    @Override
    public int count(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.count(drugdictionary);
    }
}

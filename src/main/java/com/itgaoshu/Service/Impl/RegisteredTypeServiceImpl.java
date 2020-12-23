package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Registeredtype;
import com.itgaoshu.dao.RegisteredTypeMapper;
import com.itgaoshu.service.RegisteredTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class RegisteredTypeServiceImpl implements RegisteredTypeService {
    @Resource
    private RegisteredTypeMapper registeredTypeMapper;

    @Override
    public List<Registeredtype> registeredTypeList(Registeredtype registeredtype) {
        return registeredTypeMapper.registeredTypeList(registeredtype);
    }

    @Override
    public int addRegisteredType(Registeredtype registeredtype) {
        return registeredTypeMapper.addRegisteredType(registeredtype);
    }

    @Override
    public int deleteType(Integer registeredId) {
        return registeredTypeMapper.deleteType(registeredId);
    }

    @Override
    public int editRegisteredType(Registeredtype registeredtype) {
        return registeredTypeMapper.editRegisteredType(registeredtype);
    }

    @Override
    public int count(Registeredtype registeredtype) {
        return registeredTypeMapper.count(registeredtype);
    }
}

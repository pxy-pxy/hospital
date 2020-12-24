package com.itgaoshu.service.Impl;

import com.itgaoshu.Mapper.UpplierMapper;
import com.itgaoshu.bean.Upplier;
import com.itgaoshu.service.UpplierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UpplierServiceImpl implements UpplierService {
    @Resource
    private UpplierMapper upplierMapper;

    @Override
    public List<Upplier> findAllUpplier(Upplier upplier) {
        return upplierMapper.findAllUpplier(upplier);
    }

    @Override
    public int addUpplier(Upplier upplier) {
        return upplierMapper.addUpplier(upplier);
    }

    @Override
    public int deleteUpplier(Integer supplierId) {
        return upplierMapper.deleteUpplier(supplierId);
    }

    @Override
    public int count(Upplier upplier) {
        return upplierMapper.count(upplier);
    }
}

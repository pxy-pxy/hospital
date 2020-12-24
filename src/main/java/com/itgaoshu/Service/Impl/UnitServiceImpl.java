package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Unit;
import com.itgaoshu.Mapper.UnitMapper;
import com.itgaoshu.service.UnitService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UnitServiceImpl implements UnitService {
    @Resource
    private UnitMapper unitMapper;

    @Override
    public List<Unit> findAddUnit(Unit unit) {
        return unitMapper.findAddUnit(unit);
    }

    @Override
    public int addUnit(Unit unit) {
        return unitMapper.addUnit(unit);
    }

    @Override
    public int delete(Integer unitId) {
        return unitMapper.delete(unitId);
    }

    @Override
    public int count(Unit unit) {
        return unitMapper.count(unit);
    }
}

package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Area;
import com.itgaoshu.Mapper.AreaMapper;
import com.itgaoshu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaMapper areaMapper;


    @Override
    public List<Area> findAllArea(Area area) {
        return areaMapper.findAllArea(area);
    }

    @Override
    public int deleteArea(Integer areaId) {
        return areaMapper.deleteArea(areaId);
    }

    @Override
    public int addArea(Area area) {
        return areaMapper.addArea(area);
    }

    @Override
    public int count(String name) {
        return areaMapper.count(name);
    }
}

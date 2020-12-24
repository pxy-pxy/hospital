package com.itgaoshu.service.Impl;

import com.itgaoshu.Mapper.SkullMapper;
import com.itgaoshu.bean.Skull;
import com.itgaoshu.service.SkullService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SkullServiceImpl implements SkullService {
    @Resource
    private SkullMapper skullMapper;

    @Override
    public List<Skull> findAllSkull(Skull skull) {
        return skullMapper.findAllSkull(skull);
    }

    @Override
    public int addSkull(Skull skull) {
        return skullMapper.addSkull(skull);
    }

    @Override
    public int deleteSkull(Integer skullId) {
        return skullMapper.deleteSkull(skullId);
    }

    @Override
    public int editSkull(Skull skull) {
        return skullMapper.editSkull(skull);
    }
}

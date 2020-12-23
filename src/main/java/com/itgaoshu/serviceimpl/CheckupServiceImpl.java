package com.itgaoshu.serviceimpl;

import com.itgaoshu.bean.Checkup;
import com.itgaoshu.mapper.CheckupMapper;
import com.itgaoshu.service.CheckupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 9:26
 */
@Service
@Transactional
public class CheckupServiceImpl implements CheckupService {
    @Resource
    private CheckupMapper checkupMapper;

    @Override
    public int addCheckup(Checkup checkup) {

        return checkupMapper.addCheckup(checkup);
    }

    @Override
    public int updPrice(Checkup checkup) {
        return checkupMapper.updPrice(checkup);
    }

    @Override
    public List<Checkup> selCheckup(Checkup checkup) {
        return checkupMapper.selCheckup(checkup);
    }

}

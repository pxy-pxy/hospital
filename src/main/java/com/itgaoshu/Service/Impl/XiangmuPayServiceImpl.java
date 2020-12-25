package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Cashier;
import com.itgaoshu.Mapper.XiangmuPayMapper;
import com.itgaoshu.service.XiangmuPayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-24 11:39
 */
@Service
@Transactional
public class XiangmuPayServiceImpl implements XiangmuPayService {
    @Resource
    private XiangmuPayMapper xiangmuPayMapper;

    //查询用户所有项目
    @Override
    public List<Cashier> selxiang(Integer perid){
        return xiangmuPayMapper.selxiang(perid);
    }

    //查询该用户有没有收费项目
    @Override
    public Integer selshoux(Integer perid){
        return xiangmuPayMapper.selshoux(perid);
    }

    //项目收费后修改项目的收费状态
    @Override
    public Integer updxiang(Integer perid){
        return xiangmuPayMapper.updxiang(perid);
    }

    //项目检查页面查询用户所有要检查的项目
    @Override
    public List<Cashier> selcha(Integer perid){
        return xiangmuPayMapper.selcha(perid);
    }

    //添加项目的检查结果
    @Override
    public Integer addjie(Cashier cashier){
        return xiangmuPayMapper.addjie(cashier);
    }
}

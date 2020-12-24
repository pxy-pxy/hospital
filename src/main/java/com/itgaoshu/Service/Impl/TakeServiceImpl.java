package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.ReportVo;
import com.itgaoshu.mapper.TakeMapper;
import com.itgaoshu.service.TakeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-23 18:51
 */
@Service
@Transactional
public class TakeServiceImpl  implements TakeService {
    @Resource
    private TakeMapper takeMapper;
    //查看缴费没拿药的患者
    @Override
    public List<ReportVo> sel(){
        return takeMapper.sel();
    }
    //修改用户状态
    @Override
    public Integer chuku(ReportVo reportVo){
        return takeMapper.chuku(reportVo);
    }
    //查看缴费拿过药的患者
    @Override
    public List<ReportVo> selhuan(ReportVo reportVo){
        return takeMapper.selhuan(reportVo);
    }
    //查询该用户的总价钱
    @Override
    public int zong(Integer reid){
        return takeMapper.zong(reid);
    }
}

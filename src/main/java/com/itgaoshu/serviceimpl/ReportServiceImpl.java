package com.itgaoshu.serviceimpl;

import com.itgaoshu.bean.*;
import com.itgaoshu.dao.ReportMapper;
import com.itgaoshu.service.ReportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-21 15:40
 */
@Service
@Transactional
public class ReportServiceImpl implements ReportService {

    @Resource
    private ReportMapper reportMapper;
    //查询挂号人的所有信息
    @Override
    public List<ReportVo> sel(ReportVo reportVo) {

        return reportMapper.sel(reportVo);
    }
    //查询某个患者的详细信息
    @Override
    public List<ReportVo> selById(Integer reportId) {

        return reportMapper.selById(reportId);
    }
    //查询科室
    @Override
    public List<Departments> seldep() {

        return reportMapper.seldep();
    }
    //查询挂号类型
    @Override
    public List<Registeredtype> selreg() {

        return reportMapper.selreg();
    }
    //查询排班医生
    //星期一
    @Override
    public List<ReportVo> one(Doctor Doctor) {

        return reportMapper.one(Doctor);
    }
    //星期二
    @Override
    public List<ReportVo> two(Doctor Doctor) {

        return reportMapper.two(Doctor);
    }
    //星期三
    @Override
    public List<ReportVo> three(Doctor Doctor) {

        return reportMapper.three(Doctor);
    }
    //星期四
    @Override
    public List<ReportVo> four(Doctor Doctor) {

        return reportMapper.four(Doctor);
    }
    //星期五
    @Override
    public List<ReportVo> five(Doctor Doctor) {

        return reportMapper.five(Doctor);
    }
    //星期六
    @Override
    public List<ReportVo> six(Doctor Doctor) {

        return reportMapper.six(Doctor);
    }
    //星期天
    @Override
    public List<ReportVo> seven(Doctor Doctor) {

        return reportMapper.seven(Doctor);
    }


    @Override
    public Integer seltymo(Registeredtype cRegisteredtype) {

        return reportMapper.seltymo(cRegisteredtype);
    }
    //添加患者
    @Override
    public Integer addre(Report cReport) {

        return reportMapper.addre(cReport);
    }
    //删除患者
    @Override
    public Integer delre(Integer id) {

        return reportMapper.delre(id);
    }
    //判断正在就诊的患者电话唯一
    @Override
    public Integer phone(Report cReport) {

        return reportMapper.phone(cReport);
    }
    //判断正在就诊的患者身份证号唯一
    @Override
    public Integer carid(Report cReport) {

        return reportMapper.carid(cReport);
    }

    @Override
    public int upddang() {

        return reportMapper.upddang();
    }
    //从门诊转入住院
    @Override
    public Integer zhuanyuan(Report cReport) {

        return reportMapper.zhuanyuan(cReport);
    }

}

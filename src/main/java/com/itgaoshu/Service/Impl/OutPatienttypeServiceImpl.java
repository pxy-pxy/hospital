package com.itgaoshu.service.Impl;

import com.itgaoshu.bean.Cashier;
import com.itgaoshu.bean.Outpatienttype;
import com.itgaoshu.bean.Pharmacy;
import com.itgaoshu.bean.ReportVo;
import com.itgaoshu.mapper.OutpatienttypeMapper;
import com.itgaoshu.service.OutpatienttypeService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tan
 * @create 2020-12-24 11:13
 */
@Controller
@Transactional
public class OutPatienttypeServiceImpl implements OutpatienttypeService {

        @Resource
        private OutpatienttypeMapper outpatienttypeMapper;
        //查询门诊收费项目
        @Override
        public List<Pharmacy> selout(Outpatienttype outpatienttype) {
            return outpatienttypeMapper.selout(outpatienttype);
        }
        //查询该用户的处方中是否有该项目
        @Override
        public Integer selchuo(Cashier cashier) {
            return outpatienttypeMapper.selchuo(cashier);
        }
        //给该项目添加到处方表
        @Override
        public Integer addchuo(Cashier cashier) {
            return outpatienttypeMapper.addchuo(cashier);
        }
        //修改该项目的数量
        @Override
        public Integer updchuo(Cashier cashier) {
            return outpatienttypeMapper.updchuo(cashier);
        }
        //删除处方中的项目
        @Override
        public Integer delchuo(Cashier cashier) {
            return outpatienttypeMapper.delchuo(cashier);
        }
        //查询该用户的处方价格
        @Override
        public Double selch(Cashier cashier) {
            return outpatienttypeMapper.selch(cashier);
        }

        @Override
        public Integer shoufei(ReportVo reportVo) {
            return outpatienttypeMapper.shoufei(reportVo);
        }

        @Override
        public Integer guafei(ReportVo reportVo) {
            return outpatienttypeMapper.guafei(reportVo);
        }


}

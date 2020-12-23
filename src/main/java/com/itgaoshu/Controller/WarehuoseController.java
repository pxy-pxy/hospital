package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Warehuose;
import com.itgaoshu.service.WarehuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("warehuos")
public class WarehuoseController {
    @Autowired
    private WarehuoseService warehuoseService;

    /*
     * 查询仓库
     * */
    public Object findAllWarehuose(Warehuose warehuose ,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Warehuose> list = warehuoseService.findAllWarehuose(warehuose);
        PageInfo pageInfo =new PageInfo(list);
        Map<String,Object> tableData =new HashMap<String, Object>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());
        return tableData;

    }
    /*
     * 查询仓库
     * */

}

package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.ReportVo;
import com.itgaoshu.service.TakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tan
 * @create 2020-12-23 18:43
 */
@Controller
@RequestMapping("caotake")
public class TakeController {
    @Autowired
    private TakeService takeService;
    @RequestMapping("seltake")
    private  Object seltake(){
        return  "cao.Cquyao";
    }
    //查询所有患者信息
    @RequestMapping("tselpreson")
    @ResponseBody
    public Object tselperson(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<ReportVo> sel = takeService.sel();
        PageInfo pageInfo = new PageInfo(sel);
        Map<String, Object> tableDate = new HashMap<String,Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableDate.put("code",0);
        tableDate.put("msg","");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableDate.put("count",pageInfo.getTotal());
        //将分页后的数据返回(每页要显示的数据)
        tableDate.put("data",pageInfo.getList());
        return "tableData";
    }

}

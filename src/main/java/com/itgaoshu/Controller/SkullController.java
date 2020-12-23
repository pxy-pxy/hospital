package com.itgaoshu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.bean.Skull;
import com.itgaoshu.service.SkullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("skull")
public class SkullController {
    @Autowired
    private SkullService skullService;
    /*
    * 查询经办人
    * */
    @RequestMapping("/findAllSkull")
    @ResponseBody
    public Object findAllSkull(Skull skull,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Skull> list = skullService.findAllSkull(skull);
        PageInfo pageInfo=new PageInfo(list);
        Map<String ,Object> tableData=new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
    * 添加经办人
    * */
    @RequestMapping("/addSkull")
    public Object addSkull(Skull skull){
        int i = skullService.addSkull(skull);
        if (i==1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    /*
     * 删除经办人
     * */
   @ResponseBody
   @RequestMapping("deleteSkull")
    public Object deleteSkull(Integer skullId){
        int i = skullService.deleteSkull(skullId);
        if (i==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
    /*
     * 修改经办人
     * */
    @RequestMapping("editSkull")
    @ResponseBody
    public Object editSkull(Skull skull){
        int i = skullService.editSkull(skull);
        if (i==1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }


}

package com.itgaoshu.Controller;

import com.itgaoshu.Service.ServiceImpl.UserLoginServiceImpl;
import com.itgaoshu.Service.UserLoginService;
import com.itgaoshu.bean.JsonRes;
import com.itgaoshu.bean.Menu;
import com.itgaoshu.bean.TreeNode;
import com.itgaoshu.bean.UserLogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller

public class FirstContorlller extends BaseController {
    @Autowired
    private UserLoginService userLoginService;
    @RequestMapping("login.do")//进入登录页面
   public String login(){
       return "view/login";
   }
@RequestMapping("panduan.do")//判断登陆的user和password
public String login2(String loginname, String pwd, Model model,HttpSession session){
/*  //1、创建subject
    Subject subject = SecurityUtils.getSubject();//获得当前用户的登陆对象，现在状态为未认证
    //2、封装token、凭证（用户名、密码的令牌）
    UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginname,pwd);
    //3、登录
    try{//使用异常来捕获登陆失败的消息
      subject.login(usernamePasswordToken);//将令牌传到shiro进行login方法的验证
        //没有异常表示登陆成功
        UserLogin user = userLoginService.login(loginname);
        session.setAttribute("user" ,user);
        return "view/index";
    }catch (UnknownAccountException uae){
        model.addAttribute("msg","未知用户");
        return "view/login";
    }catch (IncorrectCredentialsException ice){
        model.addAttribute("msg","用户名密码不正确");
        return "view/login";
    }catch (Exception e){
        model.addAttribute("msg","验证未通过");
        return "view/login";
    }*/

    //第一步：建立subject
    Subject subject = SecurityUtils.getSubject();
    //第二步：封装token  凭证
    UsernamePasswordToken token = new UsernamePasswordToken(loginname, pwd);
    System.out.println("走了这一步");
    //第三步：登陆
    try {
        //只要能通过认证就能通过了
        subject.login(token);
        UserLogin users=userLoginService.login(loginname);
        //把user放进session
        session.setAttribute("user", users);
        model.addAttribute("loginname",users.getRealname());
        model.addAttribute("id",users.getUserid());
        //把yonghu放进session
       session.setAttribute("yonghu", users.getRealname());
        return "view/index";//跳转首页
    } catch (UnknownAccountException e) {
        //用户为空或不存在
        model.addAttribute("msg", "不存在这样的用户!");
        return "view/login";
    } catch (IncorrectCredentialsException e) {
        model.addAttribute("msg", "密码输入不对!");
        return "view/login";
    }
}
    @RequestMapping("toTreeLoad")
    @ResponseBody
    public List<TreeNode> toTreeNode(HttpSession session){
       UserLogin userLogin=(UserLogin) session.getAttribute("user");
        //根据不同的id查询出不同的菜单列表
        List<Menu> list = userLoginService.getMenu(userLogin.getUserid());
        //创建list集合
        //把list放入nodes
        List<TreeNode> nodes = new ArrayList<>();
        for (Menu menus : list) {
            Integer id = menus.getId();
            Integer pid = menus.getPid();
            String title = menus.getTitle();
            String icon = menus.getIcon();
            String href = menus.getHref();
            Boolean spread = menus.getSpread() == true;
            String target = menus.getTarget();
            nodes.add(new TreeNode(id, pid, title, icon, href, spread, target));
        }
        //组装菜单
        List<TreeNode> treeNodes = new ArrayList<>();
        //n1.getPid() == 1 为父级菜单
        for (TreeNode n1 : nodes) {
            if (n1.getPid() == 1) {
                treeNodes.add(n1);
            }
            //将n2放入n1的子级中   id为子级
            for (TreeNode n2 : nodes) {
                if (n2.getPid() == n1.getId()) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return treeNodes;
    }
    @ResponseBody
    @RequestMapping("jr")//J.R.Simth
    public JsonRes review(){
        List<Menu> list = userLoginService.getMenu1();//获得所有的菜单管理的左侧叶面
        List<TreeNode> nodes = new ArrayList<>();
        for (Menu menus : list) {
            Integer id = menus.getId();
            Integer pid = menus.getPid();
            String title = menus.getTitle();
            String icon = menus.getIcon();
            String href = menus.getHref();
            Boolean spread = menus.getSpread() == true;
            String target = menus.getTarget();
            nodes.add(new TreeNode(id, pid, title, icon, href, spread, target));
        }
        return new JsonRes(nodes);

    }
}


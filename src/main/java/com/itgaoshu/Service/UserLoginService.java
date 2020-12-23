package com.itgaoshu.Service;

import com.itgaoshu.bean.Menu;
import com.itgaoshu.bean.UserLogin;

import java.util.List;

public interface UserLoginService {
  public UserLogin login(String loginname);

  public List<Menu> getMenu(int id);//根据不同的身份id来获得不同的菜单

  public List<Menu> getMenu1();//获取菜单管理的左侧列表
}

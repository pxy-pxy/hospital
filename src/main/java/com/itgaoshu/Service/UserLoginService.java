package com.itgaoshu.Service;

import com.itgaoshu.bean.Menu;
import com.itgaoshu.bean.UserLogin;

import java.util.List;

public interface UserLoginService {
  public UserLogin login(String loginname);

  public List<Menu> getMenu(int id);
}

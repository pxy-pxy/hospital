package com.itgaoshu.Mapper;

import com.itgaoshu.bean.Menu;
import com.itgaoshu.bean.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserLoginMapper {
    @Select("select * from sys_user where loginname=#{loginname} and available=1")
    public UserLogin userLogin( String loginname);
    //通过不同的id来获取不同的登录菜单
    @Select("SELECT t4.* FROM sys_user t,sys_role_user t2,sys_role_menu t3,sys_menu t4 WHERE t.userid=t2.uid AND t2.uid= t3.rid AND t3.mid=t4.id AND t.userid=#{id} ")
    public List<Menu> getMenu(int id);
}

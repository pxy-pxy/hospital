package com.itgaoshu.Service.ServiceImpl;

import com.itgaoshu.Service.UserLoginService;
import com.itgaoshu.bean.Menu;
import com.itgaoshu.bean.UserLogin;
import com.itgaoshu.Mapper.UserLoginMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Transactional
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserLoginMapper userLoginMapper;
    public UserLogin login(String loginname){
            return userLoginMapper.userLogin(loginname);
    }

    public List<Menu> getMenu(int id){
        return userLoginMapper.getMenu(id);
    }
}

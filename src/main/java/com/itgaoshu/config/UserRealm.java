package com.itgaoshu.config;



import com.itgaoshu.Service.UserLoginService;
import com.itgaoshu.bean.UserLogin;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserLoginService userLoginService;

    /*
     * 认证
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取的前台username

        String username = (String) authenticationToken.getPrincipal();

        UserLogin sysUser = null;
        try {
            sysUser = userLoginService.login(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //判断对象是否有值
        if (sysUser == null) {
            return null;
        }
        //密码不需要我们比对，shiro会给我们比对                      //对象    //获取前台密码
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysUser, sysUser.getPwd(), ByteSource.Util.bytes(sysUser.getSalt()), getName());
        System.out.println(sysUser.getPwd());
        return info;

    }

    /*
     * 授权
     * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


}

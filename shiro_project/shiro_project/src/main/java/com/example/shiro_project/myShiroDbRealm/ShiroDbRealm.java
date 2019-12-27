package com.example.shiro_project.myShiroDbRealm;

import com.example.shiro_project.shiro.UserInfo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

public class ShiroDbRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        Set<String> roleSet = new HashSet<>();
        Set<String> perSet = new HashSet<>();
        perSet.add("delete");
        roleSet.add("admin");
        UserInfo userInfo = (UserInfo)principalCollection.getPrimaryPrincipal();
        System.out.println(userInfo.getUsername());
        System.out.println(userInfo.getPassword());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roleSet);
        simpleAuthorizationInfo.setStringPermissions(perSet);
        return simpleAuthorizationInfo;
    }
    /**
     * 验证用户
     * <p>
     * 如果身份验证失败请捕获 AuthenticationException 或其子类，常见的如:
     * DisabledAccountException(禁用的帐号)、
     * LockedAccountException(锁定的帐号)、
     * UnknownAccountException(错误的帐号)、
     * ExcessiveAttemptsException(登录失败次数过 多)、
     * IncorrectCredentialsException (错误的凭证)、
     * ExpiredCredentialsException(过期的 凭证)等
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);

        System.out.println(password);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userInfo,password,getName());


        return simpleAuthenticationInfo;
    }
}

package com.example.shiro_project.shiro;

import com.example.shiro_project.myShiroDbRealm.ShiroDbRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ShiroDbRealmTest {



    @Test
    public void testAuthen() {
        ShiroDbRealm shiroDbRealm = new ShiroDbRealm();
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(shiroDbRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zz", "123qwqweqweqwee45");
        subject.login(token);
        subject.checkRoles("admin");
        subject.checkPermission("delete");
        System.out.println(subject.isAuthenticated());

        System.out.println(subject.isAuthenticated());
    }
}

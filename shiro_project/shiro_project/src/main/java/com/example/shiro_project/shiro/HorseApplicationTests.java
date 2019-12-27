package com.example.shiro_project.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HorseApplicationTests {

    /**
     * Spring Boot 默认已经配置好了数据源，程序员可以直接 DI 注入然后使用即可
     */
    @Resource
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {

                JdbcRealm jdbcRealm = new JdbcRealm();
        jdbcRealm.setDataSource(dataSource);

        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        // SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();
        // simpleAccountRealm.addAccount("admin","12345","manager","admin");
        defaultSecurityManager.setRealm(jdbcRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin","123456");
        subject.login(token);
//        subject.checkRoles("admin");
//        subject.checkPermission("user123delete");
        System.out.println(subject.isAuthenticated());
        subject.logout();
        System.out.println(subject.isAuthenticated());
    }
}

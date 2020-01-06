package com.example.log4j_slffj_project.testController;





import com.example.log4j_slffj_project.dao.UsersDOMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class testController {

    @Autowired
    UsersDOMapper usersDOMapper;

    @Test
    public void testPageHelper() {
        usersDOMapper.selectAll();
        usersDOMapper.selectUserById(1);
        System.out.println("--*---");

    }
}
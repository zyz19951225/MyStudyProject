package com.example.log4j_slffj_project.testController;


import com.example.log4j_slffj_project.dao.UserDOMapper;
import com.example.log4j_slffj_project.dataobject.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testController {

    @Autowired
    UserDOMapper userDOMapper;

   // private final static Logger logger = LoggerFactory.getLogger(testController.class);

    @Test
    public void logTest(){
//        List<UserDO> userDOList = userDOMapper.selectAll();
        System.out.println("--*--");
    }
}

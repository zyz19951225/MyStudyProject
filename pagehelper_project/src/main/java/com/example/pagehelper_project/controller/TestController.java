package com.example.pagehelper_project.controller;

import com.example.pagehelper_project.dao.UserDOMapper;
import com.example.pagehelper_project.dataobject.UserDO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.javassist.bytecode.Descriptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    UserDOMapper userDOMapper;

    @Test
    public void testPageHelper() {
        PageHelper.startPage(5, 3);
        List<UserDO> users = userDOMapper.selectAll();
        PageInfo<UserDO> userDOPageInfo = new PageInfo<>(users);
        for (UserDO user : users) {
            System.out.println("Name: " + user.getName());
        }
        System.out.println(userDOPageInfo);
        userDOPageInfo.toString();

    }
}

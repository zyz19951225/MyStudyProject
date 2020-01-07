package com.example.demo.controller;

import com.example.demo.dao.CountryDOMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    CountryDOMapper countryDOMapper;

    @Test
    public void testPageHelper() {
        System.out.println();

    }
}

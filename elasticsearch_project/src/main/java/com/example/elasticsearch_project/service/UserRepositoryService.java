package com.example.elasticsearch_project.service;

import com.example.elasticsearch_project.entity.User;

import java.io.Serializable;

public interface UserRepositoryService<T, ID extends Serializable> {

    User sava(User user);

    User getUserByLastName(String lastName);



    void doSomeThing();

}
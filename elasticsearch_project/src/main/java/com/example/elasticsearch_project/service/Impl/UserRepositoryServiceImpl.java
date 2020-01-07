package com.example.elasticsearch_project.service.Impl;

import com.example.elasticsearch_project.dao.UserRepository;
import com.example.elasticsearch_project.entity.User;
import com.example.elasticsearch_project.service.UserRepositoryService;
import org.elasticsearch.action.update.UpdateRequestBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.SimpleQueryStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService<User,String> {

    @Autowired
    UserRepository userRepository;


    @Override
    public User sava(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByLastName(String lastName) {
        List<User> userList = new ArrayList<User>();
       // QueryBuilder queryBuilder = new Q
//        int id = Integer.valueOf(lastName);
//        int idA = Integer.parseInt(lastName);

        QueryBuilder matchQueryBuilder = new MatchQueryBuilder("userName",lastName);
        Iterable<User> iterable = userRepository.search(matchQueryBuilder);
        iterable.forEach(e->userList.add(e));
        return userList.get(0);
    }

    @Override
    public void doSomeThing() {
        System.out.println("我是自定义的一个实现方法");
    }
}
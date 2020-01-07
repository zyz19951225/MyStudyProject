package com.example.elasticsearch_project.dao;


import com.example.elasticsearch_project.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  UserRepository extends ElasticsearchRepository<User, String> {
}

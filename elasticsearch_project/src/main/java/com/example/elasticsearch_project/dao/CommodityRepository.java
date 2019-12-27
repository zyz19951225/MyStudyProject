package com.example.elasticsearch_project.dao;


import com.example.elasticsearch_project.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String> {

}


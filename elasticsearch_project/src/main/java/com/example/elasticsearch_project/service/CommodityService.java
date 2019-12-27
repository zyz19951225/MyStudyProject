package com.example.elasticsearch_project.service;

import com.example.elasticsearch_project.entity.Commodity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CommodityService {

    long count();

    Commodity save(Commodity commodity);

    void delete(Commodity commodity);

    Iterable<Commodity> getAll();

    List<Commodity> getByName(String name);

    Page<Commodity> pageQuery(Integer pageNo, Integer pageSize, String kw);

}

package com.example.elasticsearch_project.test;

import com.example.elasticsearch_project.entity.Commodity;
import com.example.elasticsearch_project.entity.User;
import com.example.elasticsearch_project.service.CommodityService;
import com.example.elasticsearch_project.service.UserRepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CjsElasticsearchExampleApplicationTests {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private UserRepositoryService userRepositoryService;

    @Autowired
    public ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
        System.out.println(commodityService.count());
    }

    @Test
    public void userSave() {
        User user = new User();
        user.setFristName("t");
        user.setLastName("sx");
        user.setUserName("tsx");
        user.setId(2);
        userRepositoryService.sava(user);
    }
    @Test
    public void userSavez() {
        User user = new User();
        user.setFristName("zew");
        user.setLastName("yez");
        user.setUserName("asd");
        User user2 = new User();
        user2.setFristName("zew");
        user2.setLastName("yez");
        user2.setUserName("ddd");
        userRepositoryService.sava(user);
        userRepositoryService.sava(user2);
    }

    @Test
    public void getUserByLastName(){
        System.out.println("--*--");
        userRepositoryService.getUserByLastName("asd");
        System.out.println(userRepositoryService.getUserByLastName("asd"));
        //System.out.println(userRepositoryService.getUserByLastName("ddd").getId());
       // System.out.println(userRepositoryService.getUserByLastName("zzzzz").getId());
        //System.out.println(userRepositoryService.getUserByLastName("2").getUserName());
        System.out.println("--*--");
    }

    @Test
    public void testInsert() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009001");
        commodity.setName("原味切片面包（10片装）");
        commodity.setCategory("101");
        commodity.setPrice(880);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity);

        commodity = new Commodity();
        commodity.setSkuId("1501009002");
        commodity.setName("原味切片面包（6片装）");
        commodity.setCategory("101");
        commodity.setPrice(680);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity);

        commodity = new Commodity();
        commodity.setSkuId("1501009004");
        commodity.setName("元气吐司850g");
        commodity.setCategory("101");
        commodity.setPrice(120);
        commodity.setBrand("百草味");
        commodityService.save(commodity);

    }

    @Test
    public void testDelete() {

        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009002");
        commodityService.delete(commodity);

    }

    @Test
    public void testGetAll() {
        Iterable<Commodity> iterable = commodityService.getAll();
        iterable.forEach(e->System.out.println(e.toString()));
    }

    @Test
    public void testGetByName() {
        List<Commodity> list = commodityService.getByName("面包");
        System.out.println(list);
    }

    @Test
    public void testPage() {
        Page<Commodity> page = commodityService.pageQuery(0, 10, "切片");
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
    }
}


package com.example.bulider_patterns.Director;

import com.example.bulider_patterns.Builder.Builder;
import com.example.bulider_patterns.Builder.ConcreteBuilder;
import com.example.bulider_patterns.Product.Product;

public class Director {

    private Builder builder;

    //1 构造方法的方式注入builder对象
    public Director(Builder builder)
    {
        this.builder = builder;
    }

    //2 set方法注入builder对象
    public void setBuilder(Builder builder)
    {
        this.builder = builder;
    }

    public Product construct()
    {
        builder.builderName();
        builder.builderCode();
        builder.builderNum();
        return builder.getResult();
    }


}

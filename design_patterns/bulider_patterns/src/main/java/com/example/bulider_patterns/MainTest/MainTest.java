package com.example.bulider_patterns.MainTest;

import com.example.bulider_patterns.Builder.Builder;
import com.example.bulider_patterns.Builder.ConcreteBuilder;
import com.example.bulider_patterns.Director.Director;
import com.example.bulider_patterns.Product.Product;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainTest(){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }
}

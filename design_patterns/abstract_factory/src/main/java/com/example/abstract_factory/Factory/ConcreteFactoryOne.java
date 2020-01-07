package com.example.abstract_factory.Factory;


import com.example.abstract_factory.AbstractFactory.AbstractFactory;
import com.example.abstract_factory.AbstractProduct.AbstracProduct;
import com.example.abstract_factory.Product.ConcreteProductOne;

public class ConcreteFactoryOne implements AbstractFactory {


    @Override
    public AbstracProduct newProductOne() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductOne();
    }

    @Override
    public AbstracProduct newProductSed() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductOne();
    }
}

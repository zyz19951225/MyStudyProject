package com.example.factory_method.Factory;

import com.example.factory_method.AbstractFactory.AbstractFactory;
import com.example.factory_method.AbstractProduct.AbstracProduct;
import com.example.factory_method.Product.ConcreteProductOne;


public class ConcreteFactoryOne implements AbstractFactory {

    @Override
    public AbstracProduct newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProductOne();
    }
}

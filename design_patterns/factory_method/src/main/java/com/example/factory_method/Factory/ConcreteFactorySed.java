package com.example.factory_method.Factory;

import com.example.factory_method.AbstractFactory.AbstractFactory;
import com.example.factory_method.AbstractProduct.AbstracProduct;
import com.example.factory_method.Product.ConcreteProductSed;

public class ConcreteFactorySed implements AbstractFactory {

    @Override
    public AbstracProduct newProduct() {
            System.out.println("具体工厂2生成-->具体产品2...");
            return new ConcreteProductSed();
    }
}

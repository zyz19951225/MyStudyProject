package com.example.abstract_factory.Product;

import com.example.abstract_factory.AbstractProduct.AbstracProduct;

public class ConcreteProductOne implements AbstracProduct {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

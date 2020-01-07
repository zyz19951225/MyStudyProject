package com.example.factory_method.Product;

import com.example.factory_method.AbstractProduct.AbstracProduct;

public class ConcreteProductSed implements AbstracProduct {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}

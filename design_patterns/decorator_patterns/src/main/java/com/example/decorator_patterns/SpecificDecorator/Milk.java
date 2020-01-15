package com.example.decorator_patterns.SpecificDecorator;


import com.example.decorator_patterns.Bbeverage.Beverage;
import com.example.decorator_patterns.Decorator.Decorator;

public class Milk extends Decorator {
    private String description = "加了牛奶！";
    private Beverage beverage = null;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return beverage.getPrice() + 20;    //20表示牛奶的价格
    }

}
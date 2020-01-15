package com.example.decorator_patterns.SpecificDrinks;


import com.example.decorator_patterns.Bbeverage.Beverage;

public class HouseBlend implements Beverage {

    private String description = "白兰地";
    private double price = 50;
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }


}
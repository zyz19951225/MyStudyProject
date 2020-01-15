package com.example.decorator_patterns.MainTest;

import com.example.decorator_patterns.Bbeverage.Beverage;
import com.example.decorator_patterns.SpecificDecorator.Milk;
import com.example.decorator_patterns.SpecificDecorator.Mocha;
import com.example.decorator_patterns.SpecificDrinks.HouseBlend;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainTest(){
        Beverage beverage = new HouseBlend();	//选择了第一种咖啡豆磨制的咖啡
        beverage = new Mocha(beverage);		//为咖啡加了摩卡
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+"\n加了摩卡和牛奶的咖啡价格："+beverage.getPrice());


    }
}

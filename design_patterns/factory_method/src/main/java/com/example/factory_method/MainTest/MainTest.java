package com.example.factory_method.MainTest;

import com.example.factory_method.Factory.ConcreteFactoryOne;
import com.example.factory_method.Product.ConcreteProductOne;
import org.junit.Test;

public class MainTest {


    @Test
    public void Test(){
        ConcreteFactoryOne concreteFactoryOne = new ConcreteFactoryOne();
        ConcreteProductOne concreteProductOne = (ConcreteProductOne) concreteFactoryOne.newProduct();
        concreteProductOne.show();
    }

}

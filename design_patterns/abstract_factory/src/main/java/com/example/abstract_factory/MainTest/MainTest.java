package com.example.abstract_factory.MainTest;


import com.example.abstract_factory.Factory.ConcreteFactoryOne;
import com.example.abstract_factory.Product.ConcreteProductOne;
import org.junit.Test;

public class MainTest {


    @Test
    public void Test(){
        ConcreteFactoryOne concreteFactoryOne = new ConcreteFactoryOne();
        ConcreteProductOne concreteProductOne = (ConcreteProductOne) concreteFactoryOne.newProductOne();
        concreteProductOne.show();
    }

}

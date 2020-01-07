package com.example.bulider_patterns.Builder;

public class ConcreteBuilder extends Builder {


    public void builderName() {
        product.setName("zxc");
    }

    public void builderCode() {
        product.setCode("as");
    }

    public void builderNum() {
        product.setNum(1);
    }


}

package com.example.bulider_patterns.Builder;

import com.example.bulider_patterns.Product.Product;
import lombok.Data;


@Data
public abstract class Builder {
    protected Product product = new Product();

    public abstract void builderName();

    public abstract void builderCode();

    public abstract void builderNum();

    public Product getResult()
    {
        return product;
    }


}

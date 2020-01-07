package com.example.bulider_patterns.Product;


import lombok.Data;

@Data
public class Product {

    public String code;

    public String name;

    public int num;

    public String toString() {
        return (this.code + " " + this.name + " " + this.num);
    }


}

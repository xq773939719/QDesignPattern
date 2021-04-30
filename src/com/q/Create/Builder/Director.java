package com.q.Create.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product createProduct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD();
        return builder.getProduct();
    }

}

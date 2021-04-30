package com.q.Create.Builder;

public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract void buildPartD();


    public Product getProduct() {

        return product;
    }

}

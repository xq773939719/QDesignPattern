package com.q.Create.FactoryMethod;

public class AFactory implements Produce{
    @Override
    public Product createProduct() {
        System.out.println("AFactory produce AProduct");
        return new AProduct();
    }
}

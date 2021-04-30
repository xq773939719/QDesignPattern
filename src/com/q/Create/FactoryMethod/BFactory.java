package com.q.Create.FactoryMethod;

public class BFactory implements Produce {
    @Override
    public Product createProduct() {
        System.out.println("BFactory produce BProduct");
        return new BProduct();
    }
}

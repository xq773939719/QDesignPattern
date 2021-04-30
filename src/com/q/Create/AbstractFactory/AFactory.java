package com.q.Create.AbstractFactory;

public class AFactory implements Produce {

    @Override
    public AProduct createAProduct() {
        System.out.println("AFactory produce AProduct");
        return new AProduct();
    }

    @Override
    public BProduct createBProduct() {
        System.out.println("AFactory produce BProduct");
        return new BProduct();
    }
}

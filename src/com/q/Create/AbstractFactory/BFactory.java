package com.q.Create.AbstractFactory;

public class BFactory implements Produce {

    @Override
    public AProduct createAProduct() {
        System.out.println("BFactory produce AProduct");
        return new AProduct();
    }

    @Override
    public BProduct createBProduct() {
        System.out.println("BFactory produce BProduct");
        return new BProduct();
    }
}

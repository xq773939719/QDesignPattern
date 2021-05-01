package com.q.Struct.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("ConcreteFlyweight:" + key);
    }

    @Override
    public void operation(UnsharedFlyweight unsharedFlyweight) {
        System.out.println("ConcreteFlyweight.operation:" + key);
        System.out.println("ConcreteFlyweight.operation:" + unsharedFlyweight.getInfo());
    }
}

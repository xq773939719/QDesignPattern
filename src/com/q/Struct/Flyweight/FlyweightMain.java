package com.q.Struct.Flyweight;

import com.q.Delegate;

public class FlyweightMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("13.享元模式 开始");

        Factory factory = new Factory();
        Flyweight flyweightA1 = factory.getFlyweight("a");
        Flyweight flyweightA2 = factory.getFlyweight("a");
        Flyweight flyweightA3 = factory.getFlyweight("a");

        Flyweight flyweightB1 = factory.getFlyweight("b");
        Flyweight flyweightB2 = factory.getFlyweight("b");

        flyweightA1.operation(new UnsharedFlyweight("First a"));
        flyweightA2.operation(new UnsharedFlyweight("Second a"));
        flyweightA3.operation(new UnsharedFlyweight("Third a"));

        flyweightB1.operation(new UnsharedFlyweight("First b"));
        flyweightB2.operation(new UnsharedFlyweight("Second b"));

        System.out.println("13.享元模式 结束");

    }
}

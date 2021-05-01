package com.q.Struct.Decorator;

import com.q.Delegate;

public class DecoratorMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("11.装饰模式 开始");
        ConcreteComponent component = new ConcreteComponent();
        component.operation();

        ConcreteDecorator concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operation();

        System.out.println("11.装饰模式 结束");
    }
}

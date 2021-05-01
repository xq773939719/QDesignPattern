package com.q.Struct.Decorator;

public class ConcreteDecorator extends Decorator {
    ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // 动态地给该对象增加一些职责
        this.doSomething();
    }

    private void doSomething() {
        System.out.println("ConcreteDecorator.doSomething");
    }
}

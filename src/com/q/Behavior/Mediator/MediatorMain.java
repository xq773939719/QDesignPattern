package com.q.Behavior.Mediator;

import com.q.Delegate;

public class MediatorMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("20.中介者模式 开始");

        Mediator mediator = new ConcreteMediator();

        Component componentA = new ConcreteComponent(1);
        mediator.register(componentA);
        Component componentB = new ConcreteComponent(2);
        mediator.register(componentB);
        Component componentC = new ConcreteComponent(3);
        mediator.register(componentC);

        componentA.send();
        componentB.send();
        componentC.send();

        System.out.println("20.中介者模式 结束");
    }
}

package com.q.Behavior.ResponsibilityChain;

import com.q.Delegate;

public class ResponsibilityChainMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("17.责任链模式 开始");

        AbstractHandler handlerA = new ConcreteHandlerA();
        handlerA.setCanFocus(true);
        AbstractHandler handlerB = new ConcreteHandlerB();
        handlerB.setCanFocus(true);

        System.out.println("A handleRequest start");
        handlerA.setNext(handlerB);
        handlerB.setNext(null);
        handlerA.handleRequest();
        System.out.println("A handleRequest end");

        System.out.println("B handleRequest start");
        handlerA.setCanFocus(false);
        handlerB.setCanFocus(true);
        handlerA.handleRequest();
        System.out.println("B handleRequest end");

        System.out.println("No handleRequest start");
        handlerA.setCanFocus(false);
        handlerB.setCanFocus(false);
        handlerA.handleRequest();
        System.out.println("No handleRequest end");

        System.out.println("17.责任链模式 结束");
    }
}

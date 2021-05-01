package com.q.Behavior.ResponsibilityChain;

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest() {
        if (canFocus()) {
            System.out.println("ConcreteHandlerB.handleRequest");
        } else {
            if (getNext() == null) {
                System.out.println("No handler can handleRequest");
            } else {
                getNext().handleRequest();
            }

        }
    }
}

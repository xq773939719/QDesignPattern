package com.q.Behavior.ResponsibilityChain;

public class ConcreteHandlerA extends AbstractHandler{
    @Override
    public void handleRequest() {
        if(canFocus()) {
            System.out.println("ConcreteHandlerA.handleRequest");
        } else {
            if(getNext() == null) {
                System.out.println("No handler can handleRequest");
            } else {
                getNext().handleRequest();
            }

        }
    }
}

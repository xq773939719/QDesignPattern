package com.q.Behavior.State;

public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA");
        context.setState(new ConcreteStateB());
    }
}

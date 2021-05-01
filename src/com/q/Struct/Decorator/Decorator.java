package com.q.Struct.Decorator;

public abstract class Decorator implements Component {

    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

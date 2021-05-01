package com.q.Behavior.Mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {

    private ArrayList<Component> components = new ArrayList<Component>();

    @Override
    public void register(Component component) {
        System.out.println("ConcreteMediator.register:" + component.getId());
        if (!components.contains(component)) {
            components.add(component);
            component.setMediator(this);
        }
    }

    @Override
    public void relay(Component component) {
        for (Component item : components) {
            if (!item.equals(component)) {
                item.receive();
            }
        }
    }
}

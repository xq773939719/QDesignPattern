package com.q.Behavior.Memento;

public class ConcreteOriginator implements Originator{

    private String state;

    @Override
    public Memento save() {
        return new ConcreteMemento(this, state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

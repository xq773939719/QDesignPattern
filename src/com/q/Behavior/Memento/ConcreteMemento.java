package com.q.Behavior.Memento;

public class ConcreteMemento implements Memento {

    private ConcreteOriginator concreteOriginator;
    private String state;

    ConcreteMemento(ConcreteOriginator concreteOriginator, String state) {
        this.concreteOriginator = concreteOriginator;
        this.state = state;
    }

    @Override
    public void restore() {
        concreteOriginator.setState(state);
    }

    public String getState() {
        return state;
    }
}

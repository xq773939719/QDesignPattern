package com.q.Behavior.Mediator;

public abstract class Component {

    protected Mediator mediator;
    protected int id = 0;

    Component(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive();

    public abstract void send();
}

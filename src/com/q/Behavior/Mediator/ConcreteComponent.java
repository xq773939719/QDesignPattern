package com.q.Behavior.Mediator;

public class ConcreteComponent extends Component {
    ConcreteComponent(int id) {
        super(id);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteComponent.receive:" +id);
    }

    @Override
    public void send() {
        System.out.println("ConcreteComponent.send");
        mediator.relay(this);
    }
}

package com.q.Behavior.Memento;

import com.q.Delegate;

public class MementoMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("23.备忘录模式 开始");

        Client client = new Client();
        ConcreteOriginator originator = new ConcreteOriginator();

        originator.setState("A");
        client.add(originator.save());
        originator.setState("B");
        client.add(originator.save());
        originator.setState("C");
        System.out.println("State:" + originator.getState());

        System.out.println("Restore State Start");
        client.undo();
        System.out.println("State:" + originator.getState());
        client.undo();
        System.out.println("State:" + originator.getState());
        System.out.println("Restore State End");

        client.undo();
        System.out.println("State:" + originator.getState());
        client.undo();
        System.out.println("State:" + originator.getState());
        client.undo();
        System.out.println("State:" + originator.getState());

        System.out.println("23.备忘录模式 结束");
    }
}

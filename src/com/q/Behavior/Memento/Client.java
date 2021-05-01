package com.q.Behavior.Memento;

import java.util.ArrayList;

public class Client {
    private ConcreteOriginator originator;
    private ArrayList<Memento> history = new ArrayList<Memento>();

    public void undo() {
        if (history.isEmpty()) return;
        Memento memento = history.get(history.size() - 1);
        memento.restore();
        history.remove(memento);
    }

    public void add(Memento memento) {
        if (!history.contains(memento)) {
            history.add(memento);
        }
    }
}

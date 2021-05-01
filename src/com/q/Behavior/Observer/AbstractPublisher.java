package com.q.Behavior.Observer;

import java.util.ArrayList;

public abstract class AbstractPublisher {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public abstract void publish();

    public abstract void notifyObservers(int index);

}

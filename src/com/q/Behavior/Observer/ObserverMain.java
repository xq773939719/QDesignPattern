package com.q.Behavior.Observer;

import com.q.Delegate;

public class ObserverMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("19.观察者模式 开始");

        AbstractPublisher publisher = new Publisher();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        publisher.addObserver(observerA);
        publisher.addObserver(observerB);
        publisher.publish();

        System.out.println("19.观察者模式 结束");
    }
}

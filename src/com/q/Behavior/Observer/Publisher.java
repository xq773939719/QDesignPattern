package com.q.Behavior.Observer;

public class Publisher extends AbstractPublisher {

    private int index = 0;

    Publisher() {

    }

    public void publish() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(1000);
                        ++index;
                        notifyObservers(index);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.run();
    }

    @Override
    public void notifyObservers(int index) {
        System.out.println("Publisher.notifyObservers:" + index);
        for (Observer item : observers) {
            item.response();
        }
    }
}

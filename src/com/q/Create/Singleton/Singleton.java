package com.q.Create.Singleton;

public class Singleton {

    private Singleton() {
    }

    // lazy mode
    private static volatile Singleton instance = null;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("Singleton.show");
    }
}

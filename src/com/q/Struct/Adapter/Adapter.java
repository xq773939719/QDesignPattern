package com.q.Struct.Adapter;

public class Adapter implements NewMethods{

    private final Service adapted;

    Adapter() {
        adapted = new Service();
    }

    @Override
    public void method() {
        System.out.println("Adapter.method");
        adapted.methodOfService();
    }

}

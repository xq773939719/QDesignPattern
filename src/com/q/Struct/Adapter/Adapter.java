package com.q.Struct.Adapter;

public class Adapter implements NewMethods{

    private Service adaptee;

    Adapter() {
        adaptee = new Service();
    }

    @Override
    public void method() {
        System.out.println("Adapter.method");
        adaptee.methodOfService();
    }

}

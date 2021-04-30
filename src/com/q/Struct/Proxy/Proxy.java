package com.q.Struct.Proxy;

public class Proxy implements ProxyMethods{
    @Override
    public void methodA() {
        System.out.println("Proxy.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Proxy.methodB");
    }
}

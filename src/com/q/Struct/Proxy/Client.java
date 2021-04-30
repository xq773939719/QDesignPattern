package com.q.Struct.Proxy;

public class Client {

    private ProxyMethods proxy = null;

    public void setProxy(ProxyMethods proxy) {
        this.proxy = proxy;
    }

    public void a() {
        System.out.println("a start");
        proxy.methodA();
        System.out.println("a end");
    }

    public void b() {
        System.out.println("b start");
        proxy.methodB();
        System.out.println("b end");
    }

}

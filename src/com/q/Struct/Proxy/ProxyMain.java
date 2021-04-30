package com.q.Struct.Proxy;

import com.q.Delegate;

public class ProxyMain implements Delegate {
    @Override
    public void DO() {
        System.out.println("7.代理模式 开始");
        Client client = new Client();
        Proxy proxy = new Proxy();
        client.setProxy(proxy);
        client.a();
        client.b();
        System.out.println("7.代理模式 结束");
    }
}

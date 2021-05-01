package com.q.Behavior.Visitor;

import com.q.Delegate;

public class VisitorMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("22.访问者模式 开始");

        Client client = new Client();
        client.add(new ElementA());

        client.add(new ElementB());

        System.out.println("使用访问者A类的实例 开始");
        Visitor visitor = new VisitorA();
        client.accept(visitor);
        System.out.println("使用访问者A类的实例 结束");

        System.out.println("使用访问者B类的实例 开始");
        visitor = new VisitorB();
        client.accept(visitor);
        System.out.println("使用访问者B类的实例 结束");


        System.out.println("22.访问者模式 结束");

    }
}

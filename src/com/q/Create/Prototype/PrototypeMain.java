package com.q.Create.Prototype;

import com.q.Delegate;

public class PrototypeMain implements Delegate {
    public void invoke() {
        System.out.println("5.原型模式 开始");
        Prototype prototype = new Prototype();
        Prototype objectByPrototype = null;
        try {
            objectByPrototype = prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(objectByPrototype == prototype ? "equal" : "not equal");
        System.out.println(objectByPrototype.equals(prototype) ? "equal" : "not equal");
        System.out.println("5.原型模式 结束");
    }
}

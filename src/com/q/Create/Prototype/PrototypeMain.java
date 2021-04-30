package com.q.Create.Prototype;

import com.q.Delegate;

public class PrototypeMain implements Delegate {
    public void DO() {
        Prototype prototype = new Prototype();
        Prototype objectByPrototype = null;
        try {
            objectByPrototype = prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(objectByPrototype == prototype ? "equal" : "not equal");
        System.out.println(objectByPrototype.equals(prototype) ? "equal" : "not equal");

    }
}

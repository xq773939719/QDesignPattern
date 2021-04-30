package com.q.Create.Prototype;

public class Prototype implements Cloneable {

    Prototype() {
        System.out.println("Prototype Created");
    }

    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("clone by prototype");
        return (Prototype) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

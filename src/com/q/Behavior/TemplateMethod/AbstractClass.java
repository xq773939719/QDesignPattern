package com.q.Behavior.TemplateMethod;

public abstract class AbstractClass {

    public void templateMethod() {
        concreteMethod();
        abstractMethodA();
        abstractMethodB();
    }

    public void concreteMethod() {
        System.out.println("AbstractClass.concreteMethod");
    }

    public abstract void abstractMethodA();

    public abstract void abstractMethodB();

}

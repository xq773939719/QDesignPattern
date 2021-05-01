package com.q.Behavior.TemplateMethod;

public class ConcreteClass extends AbstractClass{

    @Override
    public void abstractMethodA() {
        System.out.println("ConcreteClass.abstractMethodA");
    }

    @Override
    public void abstractMethodB() {
        System.out.println("ConcreteClass.abstractMethodB");
    }
}

package com.q.Behavior.TemplateMethod;

import com.q.Delegate;

public class TemplateMethodMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("14.模板方法模式 开始");

        AbstractClass concreteClass = new ConcreteClass();

        concreteClass.templateMethod();

        System.out.println("14.模板方法模式 结束");

    }
}

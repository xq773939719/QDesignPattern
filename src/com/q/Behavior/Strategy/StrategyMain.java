package com.q.Behavior.Strategy;

import com.q.Delegate;

public class StrategyMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("15.策略模式 开始");

        Context context = new Context();
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        context.setStrategy(concreteStrategyA);
        context.strategyMethod();

        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        context.setStrategy(concreteStrategyB);
        context.strategyMethod();

        System.out.println("15.策略模式 结束");
    }
}

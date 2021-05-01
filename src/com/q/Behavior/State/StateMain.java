package com.q.Behavior.State;

import com.q.Delegate;

public class StateMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("18.状态模式 开始");

        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();

        System.out.println("18.状态模式 结束");
    }
}

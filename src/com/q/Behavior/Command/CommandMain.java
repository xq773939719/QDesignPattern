package com.q.Behavior.Command;

import com.q.Delegate;

public class CommandMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("16.命令模式 开始");
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Client client = new Client(concreteCommand);
        client.call();
        System.out.println("16.命令模式 结束");
    }
}

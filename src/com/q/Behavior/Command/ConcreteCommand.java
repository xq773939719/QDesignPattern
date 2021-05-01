package com.q.Behavior.Command;

public class ConcreteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("ConcreteCommand.execute");
    }
}

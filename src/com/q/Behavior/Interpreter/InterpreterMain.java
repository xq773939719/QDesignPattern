package com.q.Behavior.Interpreter;

import com.q.Delegate;

import java.util.ArrayList;

public class InterpreterMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("24.解释器模式 开始");

        Context context = new Context();
        ArrayList<Interpreter> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NoTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (Interpreter exp : list) {
            exp.interpret(context);
        }

        System.out.println("24.解释器模式 结束");
    }
}

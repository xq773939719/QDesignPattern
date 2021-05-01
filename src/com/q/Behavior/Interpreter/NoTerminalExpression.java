package com.q.Behavior.Interpreter;

public class NoTerminalExpression implements Interpreter {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
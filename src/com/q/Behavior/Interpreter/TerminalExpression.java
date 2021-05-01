package com.q.Behavior.Interpreter;

public class TerminalExpression implements Interpreter{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}

package com.q.Behavior.Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "Element.operationA";
    }
}

package com.q.Behavior.Visitor;

public class VisitorB implements Visitor{

    @Override
    public void visit(ElementA elementA) {
        System.out.println("VisitorB.visit:" + elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("VisitorB.visit:" + elementB.operationB());
    }
}

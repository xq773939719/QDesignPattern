package com.q.Behavior.Visitor;

public class VisitorA implements Visitor{

    @Override
    public void visit(ElementA elementA) {
        System.out.println("VisitorA.visit:" + elementA.operationA());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("VisitorA.visit:" + elementB.operationB());
    }
}

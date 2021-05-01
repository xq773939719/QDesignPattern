package com.q.Struct.Facade;

public class Facade {
    private SubA subA;
    private SubB subB;
    private SubC subC;

    Facade() {
        subA = new SubA();
        subB = new SubB();
        subC = new SubC();
    }

    public void abc() {
        subA.a();
        subB.b();
        subC.c();
    }
}

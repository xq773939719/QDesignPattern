package com.q.Behavior.Iterator;

public interface IteratorCollection {

    void add(Object object);

    void remove(Object object);

    Iterator createIterator();
}

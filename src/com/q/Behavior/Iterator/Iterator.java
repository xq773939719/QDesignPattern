package com.q.Behavior.Iterator;

public interface Iterator {
    Object first();

    Object end();

    Object next();

    boolean hasNext();

    int index();

    int count();
}

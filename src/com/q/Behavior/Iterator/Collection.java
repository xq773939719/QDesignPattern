package com.q.Behavior.Iterator;

import java.util.ArrayList;

public class Collection implements IteratorCollection {

    private ArrayList<Object> objects = new ArrayList<Object>();

    @Override
    public void add(Object object) {
        objects.add(object);
    }

    @Override
    public void remove(Object object) {
        objects.remove(object);
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(objects);
    }
}

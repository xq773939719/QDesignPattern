package com.q.Behavior.Iterator;

import java.util.ArrayList;

public class ListIterator implements Iterator {

    private ArrayList<Object> objects;
    private int index = -1;

    ListIterator(ArrayList<Object> objects) {
        this.objects = objects;
    }

    @Override
    public Object first() {
        if (objects.isEmpty()) {
            return null;
        }
        index = 0;
        return objects.get(index);
    }

    @Override
    public Object end() {
        if (objects.isEmpty()) {
            return null;
        }
        index = objects.size() - 1;
        return objects.get(index);
    }

    @Override
    public Object next() {
        return hasNext() ? objects.get(++index) : null;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < objects.size();
    }

    @Override
    public int index() {
        System.out.println("ListIterator.index:" + index);
        return index;
    }

    @Override
    public int count() {
        return objects.size();
    }

}

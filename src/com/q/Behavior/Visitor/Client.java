package com.q.Behavior.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {

    private ArrayList<Element> elements = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = elements.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public void remove(Element element) {
        if (elements.contains(element)) {
            elements.remove(element);
        }
    }
}


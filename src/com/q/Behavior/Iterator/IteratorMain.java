package com.q.Behavior.Iterator;

import com.q.Delegate;

public class IteratorMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("21.迭代器模式 开始");
        Collection collection = new Collection();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        ListIterator listIterator = (ListIterator) collection.createIterator();
        while (listIterator.hasNext()) {
            System.out.println("" + listIterator.index());
            listIterator.next();
        }

        listIterator = (ListIterator) collection.createIterator();
        System.out.println("First:" + listIterator.first());
        System.out.println("End:" + listIterator.end());
        System.out.println("Count:" + listIterator.count());
        System.out.println("21.迭代器模式 结束");
    }
}

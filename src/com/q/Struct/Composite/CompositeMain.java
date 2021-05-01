package com.q.Struct.Composite;

import com.q.Delegate;

import java.util.ArrayList;

public class CompositeMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("10.组合模式 开始");

        Composite root = new Composite();
        root.setId(-1);
        for (int i = 0; i < 3; i++) {
            Composite composite = new Composite();
            composite.setId(i);
            root.add(composite);
        }

        Node node = root.getChild(1);

        Leaf leaf = new Leaf();
        leaf.setId(10);
        node.add(leaf);

        System.out.println("10.组合模式 结束");
    }
}

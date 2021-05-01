package com.q.Struct.Composite;

import java.util.ArrayList;

public class Composite implements Node {

    private int id = 0;
    private ArrayList<Node> children;

    Composite() {
        children = new ArrayList<Node>();
    }

    public int getId() {
        System.out.println("Composite.getId:" + id);
        return id;
    }

    public void setId(int id) {
        System.out.println("Composite.setId:" + id);
        this.id = id;
    }

    @Override
    public void add(Node node) {
        System.out.println("Composite.add:" + node);
        children.add(node);
    }

    @Override
    public void remove(Node node) {
        System.out.println("Composite.remove:" + node);
        children.remove(node);
    }

    @Override
    public ArrayList<Node> getChildren() {
        System.out.println("Composite.getChildren:" + children.size());
        return children;
    }

    @Override
    public Node getChild(int i) {
        System.out.println("Composite.getChild:" + i);
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println("Composite.operation ID:" + this.id);
    }
}

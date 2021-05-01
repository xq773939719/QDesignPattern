package com.q.Struct.Composite;

import java.util.ArrayList;

public class Leaf implements Node {

    private int id = 0;

    Leaf() {

    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Leaf:" + id);
    }

    public int getId() {
        return id;
    }

    @Override
    public void add(Node node) {
        // none
    }

    @Override
    public void remove(Node node) {
        //none
    }

    @Override
    public void operation() {
        System.out.println("Leaf.operation ID:" + this.id);
    }

    @Override
    public ArrayList<Node> getChildren() {
        return null;
    }

    @Override
    public Node getChild(int i) {
        return null;
    }
}

package com.q.Struct.Composite;

import java.util.ArrayList;

public interface Node {
    void add(Node node);

    void remove(Node node);

    void operation();

    ArrayList<Node> getChildren();

    Node getChild(int i);
}

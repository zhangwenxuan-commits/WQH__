package com.xuan.collection;

public class Node {
    Node previous;
    Node next;
    Object element;

    public Node(Node next, Node previous, Object element) {
        this.next = next;
        this.previous = previous;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}

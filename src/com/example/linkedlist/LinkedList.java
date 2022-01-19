package com.example.linkedlist;

public class LinkedList<K> {
    public InterfaceNode<K> head;
    public InterfaceNode<K> tail;
    private int size;

    public LinkedList() {

    }

    public void addNode(InterfaceNode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            InterfaceNode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
        size++;
    }
    public void printMyNodes() {
        System.out.println(head);
    }
}


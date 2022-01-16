package com.example.linkedlist;

public class LinkedList<K> {
    public InterfaceNode<K> head;
    public InterfaceNode<K> tail;

    public LinkedList() {

    }

    public void add(InterfaceNode<K> newNode) {
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
    }

    public void printMyNodes() {
        System.out.println("My Node" + head);
    }

}


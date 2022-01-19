package com.example.linkedlist;

public class LinkedList<K> {
    public InterfaceNode<K> head;
    public InterfaceNode<K> tail;
    private int size;
    public LinkedList() {

    }

    public void add(InterfaceNode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            InterfaceNode<K> tempNode = this.tail;
            this.tail = newNode;
            this.tail.setNext(tempNode);
        }
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

    public void appendNode(InterfaceNode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            InterfaceNode<K> tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(newNode);
        }
        size++;
    }

    public void printMyNodes() {
        System.out.println("My Node" + head);
    }

}


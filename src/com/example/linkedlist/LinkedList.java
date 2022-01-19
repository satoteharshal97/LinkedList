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
            InterfaceNode<K> tempNode = this.tail;
            this.tail = newNode;
            this.tail.setNext(tempNode);
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

    public void insertBetweenNodes(InterfaceNode<K> newNode) {

        int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        InterfaceNode<K> tempNode = this.head;
        for (int i = 0; i < count; i++) {
            tempNode.setNext(newNode);
            newNode.setNext(this.tail);
        }
    }

    public void pop() {
        for (int i = 0; i < 1; i++) {
            InterfaceNode<K> tempNode = this.head;
            this.head = this.head.getNext();
        }
    }

    public InterfaceNode<K> popLast() {
        InterfaceNode<K> tempNode = this.head;
        if (this.head == null) {
            return null;
        }
        if (head.getNext() == null) {
            return null;
        }
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
            tempNode.setNext(null);
        }
        return tempNode;
    }

    public void searchLinkedList(K key) {
        InterfaceNode<K> tempNode = this.head;
        int count = 0;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.getNext();
            if (tempNode.getKey().equals(key)) {
                break;
            }
        }
        int option = Integer.parseInt(String.valueOf(count));
        switch (option) {
            case 0:
                System.out.println("Node is present at first node");
                break;
            case 1:
                System.out.println("Node is present at second node");
                break;
            case 2:
                System.out.println("Node is present at third node");
                break;
            default:
                System.out.println("Node is not present in the list");
        }

    }
    public void printMyNodes() {
        System.out.println(head);
    }
}


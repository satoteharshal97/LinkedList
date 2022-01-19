package com.example.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        MyNode <Integer> firstNode = new MyNode<>(56);
        MyNode <Integer> secondNode = new MyNode<>(30);
        MyNode <Integer> thirdNode = new MyNode<>(70);

        linkedList.appendNode(firstNode);
        linkedList.appendNode(secondNode);
        linkedList.appendNode(thirdNode);
        linkedList.printMyNodes();


    }
}

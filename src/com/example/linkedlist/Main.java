package com.example.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        linkedList.addNode(firstNode);
        linkedList.addNode(secondNode);
        linkedList.addNode(thirdNode);
        linkedList.printMyNodes();
    }


}

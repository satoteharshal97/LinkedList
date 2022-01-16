package com.example.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        MyNode <Integer> firstNode = new MyNode<>(70);
        MyNode <Integer> secondNode = new MyNode<>(30);
        MyNode <Integer> thirdNode = new MyNode<>(56);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        System.out.println(firstNode);
    }
}

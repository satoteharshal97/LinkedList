package com.example.linkedlist;

public interface InterfaceNode<K> {
    K getKey();

    void setKey(K Key);

    InterfaceNode<K> getNext();

    void setNext(InterfaceNode<K> next);
}

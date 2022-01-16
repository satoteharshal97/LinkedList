package com.example.linkedlist;

public class MyNode <K> implements InterfaceNode<K>{
    private K Key;
    private InterfaceNode<K> next;

    public MyNode(K Key){
        this.Key = Key;
    }
    @Override
    public K getKey() {
        return Key;
    }

    @Override
    public void setKey(K Key) {
        this.Key = Key;
    }

    @Override
    public InterfaceNode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(InterfaceNode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        myString.append("{MyNode:"  + "key=").append(Key).append("}");
        if(next!= null){
            myString.append("-->").append(next);
        }
        return myString.toString();
    }
}

package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {}

    public void add(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.seNext(tempNode);
            tail = tempNode;
        }
    }
    public void addFirst(INode<K> node) {
        INode<K> tempNode = node;
        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            tempNode.seNext(head);
            head = tempNode;
        }
    }
    public void addMiddle(INode<K> node) {
        INode<K> newNode = node;
        INode<K> oldNode = node;

        if (head == null) {
            head = node;
            tail = node;
        }
        else{
            oldNode= head.getNext();
            head.seNext(newNode);
            newNode.seNext(oldNode);
        }
    }
    public void printList(){
        System.out.println("MyNode "+head);
    }
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> node = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(70);
        MyNode<Integer> node3 = new MyNode<>(30);
        listNode.add(node);
        listNode.printList();

        listNode.add(node2);
        listNode.printList();

        listNode.addMiddle(node3);
        listNode.printList();
    }
}
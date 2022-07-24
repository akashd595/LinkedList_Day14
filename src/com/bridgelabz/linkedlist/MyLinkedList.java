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
    public void printList(){
        System.out.println("MyNode "+head);
    }
    public static void main(String[] args) {
        MyLinkedList<Integer> listNode = new MyLinkedList<>();
        MyNode<Integer> node = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(70);
        listNode.add(node);
        listNode.add(node2);
        listNode.add(node3);

        listNode.printList();
    }
}
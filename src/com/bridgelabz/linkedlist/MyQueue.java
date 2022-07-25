package com.bridgelabz.linkedlist;

public class MyQueue<K> {
    private final MyLinkedList<K> listNode;
    public MyQueue(){
        listNode = new MyLinkedList<>();
    }
    public void enqueue(INode<K> node){
        listNode.add(node);
    }

    public INode<K> dequeue(){
        return listNode.popFirst();
    }
    public void printQueue(){
        listNode.printList();
    }
    public static void main(String[] args) {

        MyNode<Integer> node1 = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(70);
        MyNode<Integer> node3 = new MyNode<>(30);

        MyQueue<Integer> queueTest = new MyQueue<>();
        queueTest.enqueue(node1);
        queueTest.enqueue(node2);
        queueTest.enqueue(node3);
        queueTest.printQueue();

    }
}

package com.bridgelabz.linkedlist;

public class MyStack<K> {
    private final MyLinkedList<K> listNode;
    public MyStack(){
        listNode = new MyLinkedList<>();
    }
    public void push(INode<K> node){
        listNode.add(node);
    }
    public INode<K> peak(){
        return listNode.head;
    }
    public INode<K> pop(){
        return listNode.pop();
    }
    public void printStack(){
        listNode.printList();
    }

    public static void main(String[] args) {

        MyNode<Integer> node1 = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(70);
        MyNode<Integer> node3 = new MyNode<>(30);

        MyStack<Integer> stackTest = new MyStack<>();
        stackTest.push(node1);
        stackTest.push(node2);
        stackTest.push(node3);
        stackTest.printStack();

    }
}
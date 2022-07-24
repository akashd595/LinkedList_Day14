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
    }//addMiddle
    public void pop(){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        head=head.getNext();
    }
    public void popLast(){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        INode<K> tempNode;
        tempNode = head;
        while(tempNode.getNext() != tail){
            tempNode = tempNode.getNext();
        }
        tempNode.seNext(null);
        tail=tempNode;
    }
    public void searching(INode<K> node){
        if(head==null){
            System.out.println("LinkedList is already empty ");
            return;
        }
        INode<K> tempNode=head;
        boolean check=false;

        while(tempNode != null){

            K data1 = tempNode.getKey();
            K data2 = node.getKey();
            if(data1.equals(data2)){
                System.out.println("30 is present in the list");
                check = true;
                return;
            }
            tempNode = tempNode.getNext();
        }//end while
        if(check == false){
            System.out.println("30 not found in the list");
        }
    }
    public void addAfter(INode<K> tempNode,INode<K> node){
        INode<K> tempNode1;
        INode<K> iteratorNode=head;
        while(iteratorNode != null){
            K data1 = tempNode.getKey();
            K data2 = iteratorNode.getKey();
            if(data1.equals(data2)){
                node.seNext(iteratorNode.getNext());
                iteratorNode.seNext(node);
                return;
            }
            iteratorNode = iteratorNode.getNext();
        }//end while
    }//end addAfter
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

//        listNode.pop();
//        listNode.printList();

//        listNode.popLast();
//        listNode.printList();

        listNode.searching(node3);

        MyNode<Integer> node4 = new MyNode<>(40);
        listNode.addAfter(node3, node4);
        listNode.printList();
    }
}
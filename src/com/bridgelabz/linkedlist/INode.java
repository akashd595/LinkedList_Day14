package com.bridgelabz.linkedlist;


public interface INode<K> {
    K getKey();
    void setKey(K key);
    INode getNext();
    void seNext(INode<K> next);

}
class MyNode<K> implements INode<K>{

    private K key;
    private INode<K> next;

    public MyNode(K key){
        this.key = key;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void seNext(INode<K> next) {
        this.next = next;
    }
    public String toString(){
        StringBuilder myNodeBuilder = new StringBuilder();
        myNodeBuilder.append("MyNode{"+"Key=").append(key).append("}");
        if(next != null){
            myNodeBuilder.append("-->").append(next);
        }
        return myNodeBuilder.toString();
    }
}

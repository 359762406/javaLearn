package com.qihang01.datastructure.TwoWayList;

/**
 * ClassName: Node
 * Package: com.qihang02.list.TwoWayList
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 14:38
 * @Version 1.0
 */
public class Node<E> {
    private Node prev;
    private Node next;
    private E data;
    public Node(E data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public Node(E data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}

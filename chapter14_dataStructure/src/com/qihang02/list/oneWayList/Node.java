package com.qihang02.list.oneWayList;

/**
 * ClassName: Node
 * Package: com.qihang02.list
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 10:05
 * @Version 1.0
 */
public class Node<E> {

    /*
    * /*
    单链表中的节点。
    节点是单向链表中基本的单元。
    每一个节点Node都有两个属性：
        一个属性：是存储的数据。
        一个属性：是下一个节点的内存地址。
    */
    private E data;
    private Node next;
    public Node(){
    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

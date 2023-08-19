package com.qihang01.datastructure.oneWayList;

import java.util.Iterator;

/**
 * ClassName: ListTest
 * Package: com.qihang02.list
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 10:05
 * @Version 1.0
 */

    /*
    * 链式结构
    不使用连续的存储空间存放结构的元素，而是为每一个元素构造一个节点。
    *   节点中除了存放数据本身以外，还需要存放指向下一个节点的指针。
    优点：不采用连续的存储空间导致内存空间利用率比较高，克服顺序存储结构中预知元素个数的缺点。插入或删除元素时，不需要移动大量的元素。
    缺点：需要额外的空间来表达数据之间的逻辑关系，不支持下标访问和随机访问。
    * */
public class SingleLinkList<E> implements Iterable<E>{
    private Node head;
    private Node tail;
    private int size = 0;
    public int getSize(){
        return this.size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public SingleLinkList(){
        this.head = null;
        this.tail = null;
    }
    // 向链表中添加元素的方法（向末尾添加）
    public <E> void insert(E data){
        Node node = new Node(data);
        if(this.getSize() == 0){
            head = node;
        }else{
            tail.setNext(node);
        }
        tail = node;
        this.size ++;
    }
    public <E> void insertHead(E data){
        Node node = new Node(data);
        Node lastHead;
        lastHead = head;
        head = node;
        node.setNext(lastHead);
        this.size ++;

    }
    /*
    添加到指定位置
    * */
    public <E> void insert(E data, int position){
        if(position < 0){
            throw new IndexOutOfBoundsException("索引越界");
        }
        Node node = new Node(data);
        if (position == 0){
            this.insertHead(data);
        } else if (this.getSize() == 0 || position >= this.getSize()) {
            insert(data);
        }else{
            Node current = head;

            for (int i = 1; i < this.getSize(); i++) {
                if(i == position){
                    node.setNext(current.getNext());
                    current.setNext(node);
                    break;
                }else{
                    current = current.getNext();
                }
            }
        }
        this.size ++;
    }
    public void delete(){
        Node deleteNode = tail;
        if(getSize() == 0){
            throw new RuntimeException("please insert element first");

        }
        if(getSize() == 1){
            head = null;
            tail = null;
        }else{
            Node lastNode = head;
            while(lastNode.getNext() != tail){
                lastNode = lastNode.getNext();
            }
            tail = lastNode;
            tail.setNext(null);
        }
        this.size --;
    }
    public void deleteHead(){
        if(this.getSize() == 0){
            throw new RuntimeException("please insert element first");
        }
        if(this.getSize() == 1){
            head = null;
            tail = null;
        }else {
            head = head.getNext();
        }
        this.size --;
    }
    /*
    * 删除指定位置
    * */
    public void delete(int position){
        System.out.println("delete...");
        if(this.getSize() == 0){
            throw new RuntimeException("please insert element first");
        }
        if(position < 0 || this.getSize() <= position){
            throw new IndexOutOfBoundsException("索引越界");
        }
        if (position == 0){
            System.out.println("delete head");
            this.deleteHead();
        } else if (position == this.getSize() - 1) {
            System.out.println("delete tail");
            this.delete();
        } else {
//            Node lastNode = head;
//            Node currentNode = lastNode.getNext();
//            Node nextNode = currentNode.getNext();
//            for (int i = 1; i < this.getSize(); i++) {
//                if(position == i){
//
//                    lastNode.setNext(nextNode);
//                    currentNode.setNext(null);
//                    break;
//                }
//                else{
//                    lastNode = currentNode;
//                    currentNode = nextNode;
//                    nextNode = nextNode.getNext();
//                }
//            }
            Node beforeNode = find(position - 1);
            Node currentNode = find(position);
            Node afterNode = find(position + 1);
            beforeNode.setData(afterNode);
            currentNode = null;
            this.size --;
        }

    }
    /*
    * 更改指定位置的数据
    * */
    public void  change(E data, int position){


        if(position < 0 || this.getSize() <= position){
            throw new IndexOutOfBoundsException("索引越界");
        }
        this.find(position).setData(data);
    }
    /*
    * 查找指定位置的数据，并返回数据
    * */
    public Node find(int position){
        if(position < 0 || this.getSize() <= position){
            throw new IndexOutOfBoundsException("索引越界");
        }
        Node lastNode = head;
        Node node = lastNode.getNext();
        if(position == 0){
            return lastNode;
        } else {
            for(int i = 1; i < this.getSize(); i ++){
                if(position == i){
                    return node;

                }else{
                    lastNode = node;
                    node = node.getNext();
                }
            }
        }
        return null;
    }
    /*
    遍历显示
    * */
    public void show(){
//        Node node = head;
//        System.out.println("链表的长度为" + this.getSize());
//        for (int i = 0; i < this.getSize(); i ++){
//
//            System.out.print(node.getData() + " ");
//            node = node.getNext();
//        }
//        System.out.println();
        Iterator<E> iterator = this.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.print("\n");

    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> node = head;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E value = node.getData();
                node = node.getNext();
                return value;
            }
        };
    }
}

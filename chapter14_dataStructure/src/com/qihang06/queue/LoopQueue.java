package com.qihang06.queue;

/**
 * ClassName: LoopQueue
 * Package: com.qihang06.queue
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 15:56
 * @Version 1.0
 */
public class LoopQueue<E> implements Queue<E>{
    /**
     * 储存队列的元素
     */
    private E[] data;
    /**
     * 队首位置
     */
    private int front;
    /**
     * 对位位置
     */
    private int tail;
    /**
     * 队列长度
     */
    private int size;

    /**
     * 无参构造
     */
    public LoopQueue() {
        this(10);
    }

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1]; // 浪费一个空间
        front = 0;
        tail = 0;
        size = 0;
    }

    /**
     * 获取真实的长度
     * @return
     */
    public int getCapacity(){
        return data.length - 1;
    }
    public boolean isFull(){
        return (tail + 1) % data.length == front;
    }

    @Override
    public void add(E e) {
        if(!isFull()){
            data[tail] = e;
            tail = (tail + 1) % data.length;
            size ++;
        }
    }

    @Override
    public E pop() {
        if(!isEmpty()){
            E value =  data[front];
            front = (front + 1) % data.length;
            size --;
            return value;
        }else{
            throw new IllegalArgumentException("队列为空");
        }
    }

    @Override
    public E getFront() {
        if (!isEmpty()){
            throw new IllegalArgumentException("队列为空");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return (tail - front + data.length) % data.length;
    }

    @Override
    public boolean isEmpty() {
        return tail == front;
    }
    private void resize(int newCapacity){
        E[] newDate = (E[]) new Object[newCapacity + 1];
        for(int i = 0; i < this.getSize(); i ++){
            newDate[i] = data[(front + 1) % data.length];
        }
        data = newDate;
        tail = size;
        front = 0;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue:size=%d, capacity=%d\n", size, getCapacity()));
        res.append("front [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail) {
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}


package com.qihang06.queue;

/**
 * ClassName: Queue
 * Package: com.qihang06.queue
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 15:49
 * @Version 1.0
 */
public interface Queue<E> {
    /**
     * 入队
     * @param e
     */
     public void add(E e);

    /**
     * 出队
     * @return
     */
     public E pop();

    /**
     * 获取队首元素
     * @return
     */
    public E getFront();

    /**
     * 获取队列长度
     * @return
     */
    public int getSize();

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty();


}

package com.qihang01.datastructure.TwoWayList;

import org.junit.Test;

/**
 * ClassName: TwoWayListTest
 * Package: com.qihang02.list.TwoWayList
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 14:42
 * @Version 1.0
 */
public class TwoWayListTest {
    @Test
    public void test1(){
        Node node1 = new Node("AA");
        Node node2 = new Node("BB");
        Node node3 = new Node("CC");
        node2.setPrev(node1);
        node2.setNext(node3);
        node1.setNext(node2);
        node3.setPrev(node2);
    }

}

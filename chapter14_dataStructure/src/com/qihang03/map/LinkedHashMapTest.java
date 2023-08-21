package com.qihang03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName: LinkedHashMapTest
 * Package: com.qihang03.map
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/21 12:00
 * @Version 1.0
 */
public class LinkedHashMapTest {
    @Test
    public void test(){
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("AA",123);
    }
    //内部定义的Entry如下：
    /*
    * static class Entry<K,V> extends HashMap.Node<K,V> {
        Entry<K,V> before, after; //添加一对双向链表

        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
    * */
    //LinkedHashMap重写了HashMap中的newNode()方法：
    /*
    * Node<K,V> newNode(int hash, K key, V value, Node<K,V> e) {
        LinkedHashMap.Entry<K,V> p =
            new LinkedHashMap.Entry<K,V>(hash, key, value, e);
        linkNodeLast(p);
        return p;
    }
    * */
    /*
    * TreeNode<K,V> newTreeNode(int hash, K key, V value, Node<K,V> next) {
        TreeNode<K,V> p = new TreeNode<K,V>(hash, key, value, next);
        linkNodeLast(p);
        return p;
    }
    * */
}

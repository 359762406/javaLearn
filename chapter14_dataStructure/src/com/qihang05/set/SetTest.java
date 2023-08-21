package com.qihang05.set;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: SetTest
 * Package: com.qihang05.set
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/21 16:23
 * @Version 1.0
 */
public class SetTest {

    /*
    * Set的内部实现其实是一个Map，Set中的元素，存储在HashMap的key中。
    * 即HashSet的内部实现是一个HashMap，
    *   TreeSet的内部实现是一个TreeMap，
    *   LinkedHashSet的内部实现是一个LinkedHashMap。
    * */
    @Test
    public void test(){
        HashSet<String> hashSet = new HashSet<>();
    }
    //构造器
    /*public HashSet() {
        map = new HashMap<>();
    }

    public HashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public HashSet(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }

    //这个构造器是给子类LinkedHashSet调用的
    HashSet(int initialCapacity, float loadFactor, boolean dummy) {
        map = new LinkedHashMap<>(initialCapacity, loadFactor);
    }

    //add()方法：
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    //其中，
    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    //iterator()方法：
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }*/
    @Test
    public void test2(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
    }
    //构造器
    /*
    public LinkedHashSet() {
        super(16, .75f, true);
    }
    public LinkedHashSet(int initialCapacity) {
        super(initialCapacity, .75f, true);//调用HashSet的某个构造器
    }
    public LinkedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor, true);//调用HashSet的某个构造器
    }
    * */
    @Test
    public void test3(){
        TreeSet<String> treeSet = new TreeSet<>();
    }
    /*
    * public TreeSet() {
        this(new TreeMap<E,Object>());
    }

    TreeSet(NavigableMap<E,Object> m) {
        this.m = m;
    }
    //其中，
    private transient NavigableMap<E,Object> m;

    //add()方法：
    public boolean add(E e) {
        return m.put(e, PRESENT)==null;
    }
    //其中，
    private static final Object PRESENT = new Object();
    * */

}

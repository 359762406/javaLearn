package com.qihang05.map;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: com.qihang05.map
 * Description:
 *1. Map及其实现类对比
 * java.util.Map:存储一对一对的数据(key-value键值对，(x1,y1)、(x2,y2) --> y=f(x),类似于高中的函数)
 *     |---- HashNap:主要实现类;线程不安全的，效率高;可以添加null的key和value值;底层使用数组+单向链表+红黑树结构存储（jdk8)
 *          |----LinkedHashNap:是HashMap的子类s在HashMap使用的数据结构的基础上，增加了一对双向链表，用于记录添加的元素的先后顺序
 *                             进而我们在遍历元素时，就可以按照添加的顺序显示。
 *                              开发中，对于频繁的遍历操作，建议使用此类。
 *      |---- TreeMap:底层使用红黑树存储;可以按照添加的key-value中的key元素的指定的属性的大小顺序进行遍历。需要考虑使用◎自然排序②定制排序。
 *      |---- Hashtable:古老实现类;线程安全的，效率低;可以添加null的key或value值;底层使用数组+单向链表结构存储（jdk8)
 *            |---- Properties：其key和value都是String类型。常用来处理属性文件。
 *
 *
 Java中的HashMap是一个非常重要的数据结构，它是基于哈希表实现的。以下是其底层实现的主要概念和特点：
 1.数组 + 链表 + 红黑树
     HashMap底层使用一个数组来保存数据（这个数组中的每一个元素通常被称为“桶”）。
     当在HashMap中存储一个键值对时，键的hashCode方法会被调用，以确定该键值对应存储的桶的索引位置。
     当多个键值对哈希到同一桶时，这些键值对会以链表的形式存储在该桶中。
     当一个桶中的链表长度超过一个特定的阈值（例如，8），该链表会被转换为红黑树以提高搜索性能。这是从Java 8开始引入的优化。
 2.哈希函数
     当添加一个新的键值对时，HashMap首先计算键的哈希码，然后用这个哈希码来决定键值对在数组中的存储位置。
     为了减少哈希冲突，HashMap还对哈希码进行了一些额外的处理。
 3.扩容
     当HashMap中的元素数量达到数组大小与负载因子（默认为0.75）的乘积时，数组会进行扩容（通常是扩大两倍）。
     扩容会涉及重新计算存储位置并将元素移到新的桶中。
 4.null键和null值
     HashMap允许使用一个null键和任意数量的null值。
     对于null键，其值被存储在数组的第0个位置。
 5.线程不安全
     HashMap在多线程环境中是不安全的，需要外部同步。如果需要线程安全的实现，
     可以考虑使用ConcurrentHashMap或者Collections.synchronizedMap()。
 6.插入、删除和查询
     在理想情况下（没有哈希冲突），HashMap的插入、删除和查询操作的时间复杂度都是O(1)。
     在最坏的情况下（所有元素都哈希到同一桶），这些操作的时间复杂度变为O(n)，但由于链表到红黑树的转换，这种情况在实际中很少见。

 2. HashMap中元素的特点
 >HashMap中的所有的key彼此之间是不可重复的、无序的。所有的key就构成一个Set集合。--->key所在的类要重写hashCode()和equals()
 >HashMap中的所有的value彼此之间是可重复的、无序的。所有的value就构成一个Collection集合。-->value所在的类要重写equals()
 >HashMap中的一个key-value,就构成了一个Entry.
 >HashNap中的所有的entry彼此之间是不可重复的、无序的。所有的entry就构成了一个Set集合。


 * @Author 刘起航
 * @Create 2023/8/16 11:48
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);
    }
    @Test
    public void test2(){
        Map map = new Hashtable();  //NullPointerException
//        map.put(null, null);
        map.put(123,"dda");
        System.out.println(map);
    }
    /*
    * keySet key用Set来存放，不允许重复，即同一个Map对象所对应的类，须重写hashCode()和equals()方法
    * values collection
    * key和value之间存在单向一对一关系，即通过指定的 key总能找到唯一的、确定的value，不同key对应的value可以重复。
    * value所在的类要重写equals()方法。
    * key和value构成一个entry。所有的entry彼此之间是无序的、不可重复的。
    *
    * */
    /*
    *   增;
        put(Object key , Object value)putAll(Map m)
        删:
        Object remove(Object key)改;
        put(Object key ,Object value)putAll(Map m)
        查:
        Object get(Object key)长度:
        长度;
        size()
        遍历:
        遍历key集:Set keySet(
        遍历value集:collection values()
        遍历entry集: Set entrySet()
    *
    * */
    @Test
    public void test3(){
        HashMap map = new HashMap();
        map.put("1234",31);
        map.put("da",11);
        map.put("da",31);
        map.put("423",123);
        map.put(new Person(12, "dada"), 123);
        System.out.println(map);
        System.out.println(map.size());
        Object value = map.remove("da");
        System.out.println(value);
        System.out.println(map);
    }
    @Test
    public void test4(){
        HashMap map = new HashMap();
        map.put("1234",31);
        map.put("da",11);
        map.put("da",31);
        map.put("423",123);
        map.put(new Person(12, "dada"), 123);
        System.out.println(map);
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key);
        }
        System.out.println();
//        Collection values = map.values();
//        for(Object obj: values){
//            System.out.println(obj);
//        }
        for (Object key : keySet){
            Object value = map.get(key);
            System.out.println(value);
        }
    }
    @Test
    public void test5(){
        HashMap map = new HashMap();
        map.put("1234",31);
        map.put("da",11);
        map.put("da",31);
        map.put("423",123);
        map.put(new Person(12, "dada"), 123);
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    

    
}

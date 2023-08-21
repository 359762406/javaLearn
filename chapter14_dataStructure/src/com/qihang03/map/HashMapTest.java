package com.qihang03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

/**
 * ClassName: HashMapTest
 * Package: com.qihang03.map
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 21:38
 * @Version 1.0
 */
public class HashMapTest {
    /*
    * HashMap和Hashtable底层都是哈希表（也称散列表），其中维护了一个长度为2的幂次方的Entry类型的数组table，
    * 数组的每一个索引位置被称为一个桶(bucket)，你添加的映射关系(key,value)最终都被封装为一个Map.Entry类型的对象，放到某个table[index]桶中。
      使用数组的目的是查询和添加的效率高，可以根据索引直接定位到某个table[index]。
    * */
    @Test
    public void test1(){
        HashMap<String, Integer> hashMap= new HashMap<>();
    }

    /**
     * JDK1.7中
     */
    //map.put(key1, value1);
    /*
    * map.put(key1,value1);
/*
分析过程如下：

将(key1,value1)添加到当前hashmap的对象中。首先会调用key1所在类的hashCode()方法，计算key1的哈希值1，
此哈希值1再经过某种运算(hash())，得到哈希值2。此哈希值2再经过某种运算(indexFor())，确定在底层table数组中的索引位置i。
   （1）如果数组索引为i上的数据为空，则(key1,value1)直接添加成功   ------位置1
   （2）如果数组索引为i上的数据不为空，有(key2,value2)，则需要进一步判断：
       判断key1的哈希值2与key2的哈希值是否相同：
         （3） 如果哈希值不同，则(key1,value1)直接添加成功   ------位置2
              如果哈希值相同，则需要继续调用key1所在类的equals()方法，将key2放入equals()形参进行判断
                （4） equals方法返回false : 则(key1,value1)直接添加成功   ------位置3
                      equals方法返回true : 默认情况下，value1会覆盖value2。

位置1：直接将(key1,value1)以Entry对象的方式存放到table数组索引i的位置。
位置2、位置3：(key1,value1) 与现有的元素以链表的方式存储在table数组索引i的位置，新添加的元素指向旧添加的元素。

...
在不断的添加的情况下，满足如下条件的情况下，会进行扩容:
if ((size >= threshold) && (null != table[bucketIndex])) :
默认情况下，当要添加的元素个数超过12(即：数组的长度 * loadFactor得到的结果)时，就要考虑扩容。

补充：jdk7源码中定义的：
static class Entry<K,V> implements Map.Entry<K,V>
*/
    //map.get(key1);
    /*
    * map.get(key1);
/*
① 计算key1的hash值，用这个方法hash(key1)

② 找index = table.length-1 & hash;

③ 如果table[index]不为空，那么就挨个比较哪个Entry的key与它相同，就返回它的value
*/
    //map.remove(key1);
    /*
    * map.remove(key1);
    /*
    ① 计算key1的hash值，用这个方法hash(key1)

    ② 找index = table.length-1 & hash;

    ③ 如果table[index]不为空，那么就挨个比较哪个Entry的key与它相同，就删除它，把它前面的Entry的next的值修改为被删除Entry的next
    */

    @Test
    public void test2(){
        
    }
    
    /**
     * JDK8中
     */
    /*
①
使用HashMap()的构造器创建对象时，并没有在底层初始化长度为16的table数组。

②
jdk8中添加的key,value封装到了HashMap.Node内部类 类的对象中,实现了Map.Entry的接口。而非jdk7中的HashMap.Entry。
static class Node<K,V> implements Map.Entry<K,V>{};
数组是Node[]
③
jdk8中新增的元素所在的索引位置如果有其他元素。在经过一系列判断后，如果能添加，
    则是旧的元素指向新的元素（尾插法）。而非jdk7中的新的元素指向旧的元素（头插法）。“七上八下”
    头插法可能在多线程模式，会导致死循环
④
jdk7时底层的数据结构是：数组+单向链表。
jdk8时，底层的数据结构是：数组+单向链表+红黑树。
红黑树出现的时机：当某个索引位置i上的链表的长度达到8，且数组的长度超过64时，此索引位置上的元素要从单向链表改为红黑树。
如果索引i位置是红黑树的结构，当不断删除元素的情况下，当前索引i位置上的元素的个数低于6时，要从红黑树改为单向链表。
复杂度为O(logn)比单向链表的时间复杂度O(n)的好

*/



}

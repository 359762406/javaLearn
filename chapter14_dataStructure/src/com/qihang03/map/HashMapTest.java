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
    public void test1() {
        HashMap<String, Integer> hashMap = new HashMap<>();
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
    @Test
    public void test(){

    }
    //key-value被封装为HashMap.Entry类型，而这个类型实现了Map.Entry接口。
    /*
    public class HashMap<K,V>{
    transient Entry<K,V>[] table;

    static class Entry<K,V> implements Map.Entry<K,V> {
        final K key;
        V value;
        Entry<K,V> next;
        int hash;


         * Creates new entry.

        Entry(int h, K k, V v, Entry<K,V> n) {
            value = v;
            next = n;
            key = k;
            hash = h;
        }
        //略
    }
    }

    * */
    //属性
    /*
    *
    * //table数组的默认初始化长度
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    //哈希表
    transient Entry<K,V>[] table;
    //哈希表中key-value的个数
    transient int size;
    //临界值、阈值（扩容的临界值）
    int threshold;
    //加载因子
    final float loadFactor;
    //默认加载因子
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    * */
    //构造器
    /*
    * public HashMap() {
        //DEFAULT_INITIAL_CAPACITY：默认初始容量16
        //DEFAULT_LOAD_FACTOR：默认加载因子0.75
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
      }
      public HashMap(int initialCapacity, float loadFactor) {
        //校验initialCapacity合法性
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        //校验initialCapacity合法性
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        //校验loadFactor合法性
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);

        //计算得到table数组的长度（保证capacity是2的整次幂）
        int capacity = 1;
        while (capacity < initialCapacity)
            capacity <<= 1;
        //加载因子，初始化为0.75
        this.loadFactor = loadFactor;
        // threshold 初始为默认容量
        threshold = (int)Math.min(capacity * loadFactor, MAXIMUM_CAPACITY + 1);
        //初始化table数组
        table = new Entry[capacity];
        useAltHashing = sun.misc.VM.isBooted() &&
                                           (capacity >= Holder.ALTERNATIVE_HASHING_THRESHOLD);
        init();
    }
    * */
    //public V put(K key, V value);
    /*
    public V put(K key, V value) {
        //如果key是null，单独处理，存储到table[0]中，如果有另一个key为null，value覆盖
        if (key == null)
            return putForNullKey(value);
        //对key的hashCode进行干扰，算出一个hash值

//          hashCode值        xxxxxxxxxx
//          table.length-1    000001111
//
//          hashCode值 xxxxxxxxxx  无符号右移几位和原来的hashCode值做^运算，使得hashCode高位二进制值参与计算，
//                                也发挥作用，降低index冲突的概率。

        int hash = hash(key);
        //计算新的映射关系应该存到table[i]位置，
        //i = hash & table.length-1，可以保证i在[0,table.length-1]范围内
        int i = indexFor(hash, table.length);
        //检查table[i]下面有没有key与我新的映射关系的key重复，如果重复替换value
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        //添加新的映射关系
        addEntry(hash, key, value, i);
        return null;
    }
    * */
    /*
    * //如果key是null，直接存入[0]的位置
    private V putForNullKey(V value) {
        //判断是否有重复的key，如果有重复的，就替换value
        for (Entry<K,V> e = table[0]; e != null; e = e.next) {
            if (e.key == null) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }
        modCount++;
        //把新的映射关系存入[0]的位置，而且key的hash值用0表示
        addEntry(0, null, value, 0);
        return null;
    }
    * */
    /*
    * final int hash(Object k) {
        int h = 0;
        if (useAltHashing) {
            if (k instanceof String) {
                return sun.misc.Hashing.stringHash32((String) k);
            }
            h = hashSeed;
        }

        h ^= k.hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    * */
    /*
    * static int indexFor(int h, int length) {
        return h & (length-1);
    }
    * */
    /*
    * void addEntry(int hash, K key, V value, int bucketIndex) {
    //判断是否需要库容
    //扩容：（1）size达到阈值（2）table[i]正好非空
    if ((size >= threshold) && (null != table[bucketIndex])) {
        //table扩容为原来的2倍，并且扩容后，会重新调整所有key-value的存储位置
        resize(2 * table.length);
        //新的key-value的hash和index也会重新计算
        hash = (null != key) ? hash(key) : 0;
        bucketIndex = indexFor(hash, table.length);
    }
	//存入table中
    createEntry(hash, key, value, bucketIndex);
}
    * */
    /*
    * void createEntry(int hash, K key, V value, int bucketIndex) {
        Entry<K,V> e = table[bucketIndex];
        //原来table[i]下面的映射关系作为新的映射关系next
        table[bucketIndex] = new Entry<>(hash, key, value, e);
        //个数增加
        size++;
    }
    * */
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
    public void test2() {

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
    /*
    * public class HashMap<K,V>{
        transient Node<K,V>[] table;

        //Node类
        static class Node<K,V> implements Map.Entry<K,V> {
            final int hash;
            final K key;
            V value;
            Node<K,V> next;

            Node(int hash, K key, V value, Node<K,V> next) {
                this.hash = hash;
                this.key = key;
                this.value = value;
                this.next = next;
            }
            // 其它结构：略
        }

        //TreeNode类
        static final class TreeNode<K,V> extends LinkedHashMap.Entry<K,V> {
            TreeNode<K,V> parent;
            TreeNode<K,V> left;
            TreeNode<K,V> right;
            TreeNode<K,V> prev;
            boolean red; //是红结点还是黑结点
            TreeNode(int hash, K key, V val, Node<K,V> next) {
                super(hash, key, val, next);
            }
        }

        //....
    }
    * */
    //属性
    /*
    *
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // 默认的初始容量 16
    static final int MAXIMUM_CAPACITY = 1 << 30; //最大容量  1 << 30
    static final float DEFAULT_LOAD_FACTOR = 0.75f;  //默认加载因子
    static final int TREEIFY_THRESHOLD = 8; //默认树化阈值8，当链表的长度达到这个值后，要考虑树化
    static final int UNTREEIFY_THRESHOLD = 6;//默认反树化阈值6，当树中结点的个数达到此阈值后，要考虑变为链表

    //当单个的链表的结点个数达到8，并且table的长度达到64，才会树化。
    //当单个的链表的结点个数达到8，但是table的长度未达到64，会先扩容
    static final int MIN_TREEIFY_CAPACITY = 64; //最小树化容量64

    transient Node<K,V>[] table; //数组
    transient int size;  //记录有效映射关系的对数，也是Entry对象的个数
    int threshold; //阈值，当size达到阈值时，考虑扩容
    final float loadFactor; //加载因子，影响扩容的频率
    * */
    //构造器
    /*
    * public HashMap() {
    this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted (其他字段都是默认值)
    }
    * */


}

package com.qihang02.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * ClassName: ListTest
 * Package: com.qihang03.list
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 10:46
 * @Version 1.0
 */
/*
* Java 集合可分为 Collection 和 Map 两大体系：

Collection接口：用于存储一个一个的数据，也称单列数据集合。
    List子接口：用来存储有序的、可以重复的数据（主要用来替换数组，"动态"数组）
    实现类：ArrayList(主要实现类)、LinkedList、Vector
Set子接口：用来存储无序的、不可重复的数据（类似于高中讲的"集合"）
    实现类：HashSet(主要实现类)、LinkedHashSet、TreeSet
Map接口：用于存储具有映射关系“key-value对”的集合，即一对一对的数据，也称双列数据集合。(类似于高中的函数、映射。(x1,y1),(x2,y2) ---> y = f(x) )

HashMap(主要实现类)、LinkedHashMap、TreeMap、Hashtable、Properties
JDK提供的集合API位于java.util包内
* */
public class ListTest {
    /*
    *
    *
    *
    * （12）Object[] toArray()：返回包含当前集合中所有元素的数组
    * （13）hashCode()：获取集合对象的哈希值
    * （14）iterator()：返回迭代器对象，用于集合遍历
    * */
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        coll.add("佛地魔");
        //集合转换为数组：集合的toArray()方法
        Object[] objects = coll.toArray();
        System.out.println("用数组返回coll中所有元素：" + Arrays.toString(objects));

        //对应的，数组转换为集合：调用Arrays的asList(Object ...objs)
        Object[] arr1 = new Object[]{123,"AA","CC"};
        Collection list = Arrays.asList(arr1);
        System.out.println(list);
    }
    /*
    * 在程序开发中，经常需要遍历集合中的所有元素。针对这种需求，JDK专门提供了一个接口java.util.Iterator。
    * Iterator接口也是Java集合中的一员，但它与Collection、Map接口有所不同。

    Collection接口与Map接口主要用于存储元素
    Iterator，被称为迭代器接口，本身并不提供存储对象的能力，主要用于 遍历 Collection中的元素
    Collection接口继承了java.lang.Iterable接口，该接口有一个iterator()方法，
    那么所有实现了Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象。

    public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的。
    集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
    Iterator接口的常用方法如下：
        public E next():返回迭代的下一个元素。
        public boolean hasNext():如果仍有元素可以迭代，则返回 true。
    注意：在调用it.next()方法之前必须要调用it.hasNext()进行检测。若不调用，且下一条记录无效，
    *   直接调用it.next()会抛出NoSuchElementException异常。
    * 在JDK8.0时，Collection接口有了removeIf 方法，即可以根据条件删除。
    * */
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        coll.add("佛地魔");
        System.out.println("coll = " + coll);

        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                String str = (String) o;
                return str.contains("地");
            }
        });
        System.out.println("删除包含\"地\"字的元素之后coll = " + coll);
    }

}

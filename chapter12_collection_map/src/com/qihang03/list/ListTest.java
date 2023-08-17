package com.qihang03.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.qihang03.list
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 14:48
 * @Version 1.0
 */
public class ListTest {
    /*
    * Java 集合就像一种容器，可以动态地把多个对象的引用放入容器中。
    数组在内存存储方面的特点：
        数组初始化以后，长度就确定了。
        数组中的添加的元素是依次紧密排列的，有序的，可以重复的。
        数组声明的类型，就决定了进行元素初始化时的类型。不是此类型的变量，就不能添加。
        可以存储基本数据类型值，也可以存储引用数据类型的变量
    数组在存储数据方面的弊端：
        数组初始化以后，长度就不可变了，不便于扩展
        数组中提供的属性和方法少，不便于进行添加、删除、插入、获取元素个数等操作，且效率不高。
        数组存储数据的特点单一，只能存储有序的、可以重复的数据
    Java 集合框架中的类可以用于存储多个对象，还可用于保存具有映射关系的关联数组
    * */
    /*
    鉴于Java中数组用来存储数据的局限性，我们通常使用java.util.List替代数组
        List集合类中元素有序、且可重复，集合中的每个元素都有其对应的顺序索引。
        JDK API中List接口的实现类常用的有：ArrayList、LinkedList和Vector。
    * */
    @Test
    public void test1(){
        // 创建List集合对象
        List<String> list = new ArrayList<String>();

        // 往 尾部添加 指定元素
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        // add(int index,String s) 往指定位置添加
        list.add(1,"没头脑");

        System.out.println(list);
        // String remove(int index) 删除指定位置元素  返回被删除元素
        // 删除索引位置为2的元素
        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));

        System.out.println(list);

        // String set(int index,String s)
        // 在指定位置 进行 元素替代（改）
        // 修改指定位置元素
        list.set(0, "三毛");
        System.out.println(list);

        // String get(int index)  获取指定位置元素
        // 跟size() 方法一起用  来 遍历的
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //还可以使用增强for
        for (String string : list) {
            System.out.println(string);
        }
    }
    /*
    * List除了从Collection集合继承的方法外，List 集合里添加了一些根据索引来操作集合元素的方法。

    插入元素
    void add(int index, Object ele):在index位置插入ele元素
    boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
    获取元素
    Object get(int index):获取指定index位置的元素
    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
    获取元素索引
    int indexOf(Object obj):返回obj在集合中首次出现的位置
    int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    删除和替换元素
    Object remove(int index):移除指定index位置的元素，并返回此元素

    Object set(int index, Object ele):设置指定index位置的元素为ele
    * */
}

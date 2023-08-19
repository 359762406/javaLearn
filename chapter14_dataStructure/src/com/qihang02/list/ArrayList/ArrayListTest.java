package com.qihang02.list.ArrayList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ArrayListTest
 * Package: com.qihang02.list.ArrayList
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 17:08
 * @Version 1.0
 */
public class ArrayListTest {
    /*
    * List集合所有的元素是以一种线性方式进行存储的，例如，存元素的顺序是11、22、33。那么集合中，元素的存储就是按照11、22、33的顺序完成的）。
    它是一个元素存取有序的集合。即元素的存入顺序和取出顺序有保证。
    它是一个带有索引的集合，通过索引就可以精确的操作集合中的元素（与数组的索引是一个道理）。
    集合中可以有重复的元素，通过元素的equals方法，来比较是否为重复的元素。
    * */

    /*
    *   List接口的主要实现类
        ArrayList：动态数组
        Vector：动态数组
        LinkedList：双向链表
        Stack：栈
    * */
    /*
    * ArrayList与Vector的区别
    它们的底层物理结构都是数组，我们称为动态数组。

  ArrayList是新版的动态数组，线程不安全，效率高，
* Vector是旧版的动态数组，线程安全，效率低。
动态数组的扩容机制不同，
*   ArrayList默认扩容为原来的1.5倍，
*   Vector默认扩容增加为原来的2倍。
数组的初始化容量，如果在构建ArrayList与Vector的集合对象时，没有显式指定初始化容量，那么Vector的内部数组的初始容量默认为10，
* 而ArrayList
* 在JDK 6.0 及之前的版本也是10，
* JDK8.0 之后的版本ArrayList初始化为长度为0的空数组，之后在添加第一个元素时，再创建长度为10的数组。
* 原因：用的时候，再创建数组，避免浪费。因为很多方法的返回值是ArrayList类型，需要返回一个ArrayList的对象，
* 例如：后期从数据库查询对象的方法，返回值很多就是ArrayList。有可能你要查询的数据不存在，要么返回null，要么返回一个没有元素的ArrayList对象
    * */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
    }





}

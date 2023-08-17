package com.qihang04.set;

import org.junit.Test;

/**
 * ClassName: HashSetTes
 * Package: com.qihang04.set
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 15:11
 * @Version 1.0
 */
public class HashSetTest {
    /*
    * HashSet 是 Set 接口的主要实现类，大多数时候使用 Set 集合时都使用这个实现类。
    HashSet 按 Hash 算法来存储集合中的元素，因此具有很好的存储、查找、删除性能。

    HashSet 具有以下特点：
        不能保证元素的排列顺序
        HashSet 不是线程安全的
        集合元素可以是 null
    HashSet 集合判断两个元素相等的标准：两个对象通过 hashCode() 方法得到的哈希值相等，
        并且两个对象的 equals()方法返回值为true。
    对于存放在Set容器中的对象，对应的类一定要重写hashCode()和equals(Object obj)方法，
       以实现对象相等规则。即：“相等的对象必须具有相等的散列码”。
    HashSet集合中元素的无序性，不等同于随机性。这里的无序性与元素的添加位置有关。
    具体来说：我们在添加每一个元素到数组中时，具体的存储位置是由元素的hashCode()调用后返回的hash值决定的。
    *   导致在数组中每个元素不是依次紧密存放的，表现出一定的无序性。
    * */
    @Test
    public void test1(){

    }
    /*
    HashSet中添加元素的过程：
    第1步：当向 HashSet 集合中存入一个元素时，HashSet会调用该对象的hashCode()方法得到该对象的hashCode值，
     然后根据 hashCode值，通过某个散列函数决定该对象在HashSet底层数组中的存储位置。
    第2步：如果要在数组中存储的位置上没有元素，则直接添加成功。
    第3步：如果要在数组中存储的位置上有元素，则继续比较：
        如果两个元素的hashCode值不相等，则添加成功；
        如果两个元素的hashCode()值相等，则会继续调用equals()方法：
            如果equals()方法结果为false，则添加成功。
            如果equals()方法结果为true，则添加失败。
        第2步添加成功，元素会保存在底层数组中。
        第3步两种添加成功的操作，由于该底层数组的位置已经有元素了，则会通过链表的方式继续链接，存储。
    * */
}

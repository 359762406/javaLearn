package com.qihang03.more.exercise1;

import org.junit.Test;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: exer1
 * Package: com.qihang03.more
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 17:11
 * @Version 1.0
 */
public class exer1 {
    /*
     * 有限制条件的通配符
     * ? extends A:可以将List<A>或List<B>赋值给List<? extends A>。其中B类是A类的子类。

     * ? super A:可以将List<A>或List<B>赋值给List<? extends A>。其中B类是A类的父类。
     *
     * */
    @Test
    public void test1(){
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;

        List<Son> list3 = null;
//        list = list1; 父类不行
        list = list2;
        list = list3;
    }
    @Test
    public void test2(){
        List<? super Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;

        List<Son> list3 = null;
        list = list1;
        list = list2;
//        list = list3; 子类不行
    }
    /*
    * 对于？ extends A的读写
    * <= A
    * */
    @Test
    public void test3(){
        List<? extends Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list = list1;
        //读取
        Father father = list.get(0);
        //写入
        list.add(null);
//        list.add(new Father()); 不可以写入
//        list.add(new Son());
    }
    /*
     * 对于？ super A的读写
     * >= A
     * */
    @Test
    public void test3_1(){
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>();

        list1.add(new Father());
        list = list1;
        //读取
        Object o = list.get(0);
        //写入 可以将Father及其子类的对象添加进来
        list.add(null);
        list.add(new Father());
        list.add(new Son());
//        list.add(new Object());
    }
}

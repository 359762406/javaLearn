package com.qihang04.set.exer3;

import org.junit.Test;

import java.util.HashSet;

/**
 * ClassName: TestHashSet
 * Package: com.qihang04.set.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 15:17
 * @Version 1.0
 */
public class TestHashSet {
    @Test
    public void test01(){
        HashSet set = new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");
        set.add("赵六");

        System.out.println("set = " + set);//不允许重复，无序
    }

    @Test
    public void test02(){
        HashSet set = new HashSet();
        set.add(new MyDate(2021,1,1));
        set.add(new MyDate(2021,1,1));
        set.add(new MyDate(2022,2,4));
        set.add(new MyDate(2022,2,4));


        System.out.println("set = " + set);//不允许重复，无序
    }
}

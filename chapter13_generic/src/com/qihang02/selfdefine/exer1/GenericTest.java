package com.qihang02.selfdefine.exer1;

import org.junit.Test;

/**
 * ClassName: GenericTest
 * Package: com.qihang02.selfdefine
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:59
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1() {
        Person<String> p1 = new Person<>();
        Person p2 = new Person(); //向下兼容
        Object e = p2.getE();
        String e1 = p1.getE();
        //距型参数在指明时，是不可以使用基本数据类型的!
        // Order<int> order1 = new.Orders<>();
        Person<Integer> p3 = new Person<>();
        p3.setE(12);
        p1.setE("121");
    }
    //测试Person的子类
    @Test
    public void test2(){
        Programmer programmer = new Programmer(); // Programmer不是泛型类
        String e = programmer.getE();
    }
    @Test
    public void test3(){
        Engineer<String> engineer = new Engineer<>();
        String engineerE = engineer.getE();
        engineer.show("123");
    }
    @Test
    public void test4(){
        Architect<Integer> architect = new Architect<>("adda", 123, 12);
        Integer t = architect.getT();
        System.out.println(t);
    }
    @Test
    public void test5(){
        Student<Integer, Engineer<String>> student = new Student<>();
        Integer e = student.getE();
        Engineer<String> v = student.getV();
        String e1 = v.getE();
    }




}

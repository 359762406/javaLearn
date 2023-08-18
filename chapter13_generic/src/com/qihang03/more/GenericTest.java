package com.qihang03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Package: com.qihang03.more
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 16:27
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;
        Object[] arr = null;
        String[] arr1 = null;
        arr = arr1;
    }
    /*
    * 1．类SuperA是类A的父类，则G<SuperA>与 6<A>的关系。G<SuperA>和G<A>是并列的两个类，
    *   没有任何子父类的关系
    * 2.类SuperA是类A的父类或接superA<G>与A<G>的关系:
    *   SuperA<G> 与A<G>有继承或实现的关系。即A<G>的实例可以赋值给SuperA<G>类型的引用（或变量)
    * */
    @Test
    public void test2(){
        ArrayList<Object> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();
        // list2 和list1 没有继承关系
        List<String> list3 = null;
        list3 = list2;
//        method(list2); Object 和 String 没有继承关系哦
    }
    public void method(ArrayList<Object> list){

    }

    /*
    * 通配符：？
    * */
    @Test
    public void test3(){
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = new ArrayList<>();
        list2.add("dad");
//        list = list1;
        list = list2;
//        method1(list);
//        method1(list1);
        //读取 返回Object类型
        Object obj = list.get(0);
        System.out.println(obj);
        //list不允许写入,除null
        list.add(null);
        method1(list2);
    }
    public void method1(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

}

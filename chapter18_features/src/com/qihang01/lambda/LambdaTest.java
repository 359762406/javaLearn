package com.qihang01.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * ClassName: LambdaTest
 * Package: com.qihang01.lambda
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 17:35
 * @Version 1.0
 */
public class LambdaTest {

    //Lambda表达式
    /*
(o1, o2) -> Integer.compare(o1, o2);
“->”：该操作符被称为 Lambda 操作符或箭头操作符。它将 Lambda 分为两个部分：
左侧：指定了 Lambda 表达式需要的参数列表
右侧：指定了 Lambda 体，是抽象方法的实现逻辑，也即 Lambda 表达式要执行的功能。
    * */
    Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1, o2);
    //方法引用
    Comparator<Integer> com2 = Integer::compare;
    @Test
    public void test(){
        int compare1 = com1.compare(42,5245);
        int compare = com2.compare(23,32);
        System.out.println(compare + " " + compare1);
    }
    //无参，无返回值
    @Test
    public void test1(){
        //未使用Lambda表达式
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();

        System.out.println("***********************");

        //使用Lambda表达式
        Runnable r2 = () -> {
            System.out.println("我爱北京故宫");
        };

        r2.run();
    }
    //Lambda 需要一个参数，但是没有返回值。
    @Test
    public void test2(){
        //未使用Lambda表达式
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");

        System.out.println("*******************");

        //使用Lambda表达式
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

    }
    //数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3(){
        //语法格式三使用前
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

        System.out.println("*******************");
        //语法格式三使用后
        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("一个是听得人当真了，一个是说的人当真了");

        int[] arr = {1,2,3,4};
        HashMap<String, Integer> map = new HashMap<>(); // 类型推断
        var entrySet = map.entrySet(); // JDK10->

    }
    //Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        //语法格式四使用前
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

        System.out.println("*******************");
        //语法格式四使用后
        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("一个是听得人当真了，一个是说的人当真了");


    }
}

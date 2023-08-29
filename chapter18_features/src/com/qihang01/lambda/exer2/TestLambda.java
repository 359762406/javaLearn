package com.qihang01.lambda.exer2;

import org.junit.Test;

import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: TestLambda
 * Package: com.qihang01.lambda.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:17
 * @Version 1.0
 */
//消费型接口
    /*
    * 在JDK1.8中Collection集合接口的父接口Iterable接口中增加了一个默认方法：

public default void forEach(Consumer<? super T> action)遍历Collection集合的每个元素，执行“xxx消费型”操作。

在JDK1.8中Map集合接口中增加了一个默认方法：

public default void forEach(BiConsumer<? super K,? super V> action)遍历Map集合的每对映射关系，执行“xxx消费型”操作。
    * */
public class TestLambda {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("hello","java","lambda","atguigu");
        Iterator<String> iterator = list.iterator();
        list.forEach(s -> System.out.println(s));
    }
    @Test
    public void test2(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "java");
        map.put(3, "lambda");
        map.put(4, "atguigu");
        map.forEach((K,V) -> System.out.println(K + " " + V));
    }
    //Consumer接口 Supplier接口
    /*
    * public static <T> Stream<T> generate(Supplier<T> s)可以创建Stream的对象。
    * 而又包含一个forEach方法可以遍历流中的元素：public void forEach(Consumer<? super T> action)。
    * */
    @Test
    public void test3(){

//        Stream.generate(() -> Math.random()).forEach(num -> System.out.println(num));
        Stream.generate(() -> {

            return Math.random();
        }).forEach((num) -> {
            System.out.println(num);
        });

    }

    

}

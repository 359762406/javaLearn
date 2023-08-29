package com.qihang02.reference;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * ClassName: InferenceTest
 * Package: com.qihang02.reference
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 11:06
 * @Version 1.0
 */
public class InferenceTest {
    /*
    * 当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
方法引用可以看做是Lambda表达式深层次的表达。
* 换句话说，方法引用就是Lambda表达式，也就是函数式接口的一个实例，通过方法的名字来指向一个方法，可以认为是Lambda表达式的一个语法糖。
    * */
    /*
    * 方法引用格式
格式：使用方法引用操作符 “::” 将类(或对象) 与 方法名分隔开来。
两个:中间不能有空格，而且必须英文状态下半角输入
如下三种主要使用情况：
情况1：对象 :: 实例方法名
情况2：类 :: 静态方法名
情况3：类 :: 实例方法名
    * */
    /*
方法引用使用前提
要求1：Lambda体只有一句语句，并且是通过调用一个对象的/类现有的方法来完成的
例如：System.out对象，调用println()方法来完成Lambda体
Math类，调用random()静态方法来完成Lambda体
* 要求2：
针对情况1：函数式接口中的抽象方法a在被重写时使用了某一个对象的方法b。
* 如果方法a的形参列表、返回值类型与方法b的形参列表、返回值类型都相同，则我们可以使用方法b实现对方法a的重写、替换。
针对情况2：函数式接口中的抽象方法a在被重写时使用了某一个类的静态方法b。
* 如果方法a的形参列表、返回值类型与方法b的形参列表、返回值类型都相同，则我们可以使用方法b实现对方法a的重写、替换。
针对情况3：函数式接口中的抽象方法a在被重写时使用了某一个对象的方法b。
* 如果方法a的返回值类型与方法b的返回值类型相同，同时方法a的形参列表中有n个参数，方法b的形参列表有n-1个参数，且方法a的第1个参数作为方法b的调用者，且方法a的后n-1参数与方法b的n-1参数匹配（类型相同或满足多态场景也可以）
    * */
    @Test
    public void test1(){
        Comparator<Integer> com  = Integer::compare;
        int result = com.compare(12,21);
        System.out.println(result);
    }
    @Test
    public void test2(){
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                int index = 0;
                System.out.println(s + ':' + index ++);
            }
        };
        consumer1.accept("hello");
        Consumer<String> consumer2 = s -> { int index = 0; System.out.println(s  + ':' + index ++);};
        consumer2.accept("hello");
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("hello");
    }


}

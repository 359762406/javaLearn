package com.qihang01.lambda.functional;

import org.junit.Test;

/**
 * ClassName: FunctionalTest
 * Package: com.qihang01.lambda
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 22:08
 * @Version 1.0
 */
public class FunctionalTest {
    /*
    * 什么是函数式接口
只包含一个抽象方法（Single Abstract Method，简称SAM）的接口，称为函数式接口。当然该接口可以包含其他非抽象方法。
你可以通过 Lambda 表达式来创建该接口的对象。（若 Lambda 表达式抛出一个受检异常(即：非运行时异常)，那么该异常需要在目标接口的抽象方法上进行声明）。
我们可以在一个接口上使用 @FunctionalInterface 注解，这样做可以检查它是否是一个函数式接口。同时 javadoc 也会包含一条声明，说明这个接口是一个函数式接口。
在java.util.function包下定义了Java 8 的丰富的函数式接口
* 如何理解
* Java从诞生日起就是一直倡导“一切皆对象”，在Java里面面向对象(OOP)编程是一切。但是随着python、scala等语言的兴起和新技术的挑战，Java不得不做出调整以便支持更加广泛的技术要求，即Java不但可以支持OOP还可以支持OOF（面向函数编程）
    Java8引入了Lambda表达式之后，Java也开始支持函数式编程。
    Lambda表达式不是Java最早使用的。目前C++，C#，Python，Scala等均支持Lambda表达式。
面向对象的思想：
    做一件事情，找一个能解决这个事情的对象，调用对象的方法，完成事情。
函数式编程思想：
    只要能获取到结果，谁去做的，怎么做的都不重要，重视的是结果，不重视过程。
在函数式编程语言当中，函数被当做一等公民对待。在将函数作为一等公民的编程语言中，Lambda表达式的类型是函数。但是在Java8中，有所不同。
* 在Java8中，Lambda表达式是对象，而不是函数，它们必须依附于一类特别的对象类型——函数式接口。
简单的说，在Java8中，Lambda表达式就是一个函数式接口的实例。这就是Lambda表达式和函数式接口的关系。
* 也就是说，只要一个对象是函数式接口的实例，那么该对象就可以用Lambda表达式来表示。
    * */
    @Test
    public void test(){
        MyFunctionalInterface m = () -> System.out.println("hello");
        m.method();
    }
    /*
    * 作为参数传递 Lambda 表达式：为了将 Lambda 表达式作为参数传递，
    * 接收Lambda 表达式的参数类型必须是与该 Lambda 表达式兼容的函数式接口的类型。
    * */
    /*
函数式接口	    称谓	        参数类型	 用途
Consumer<T>	    消费型接口	T	    对类型为T的对象应用操作，包含方法： void accept(T t)
Supplier<T>	    供给型接口	无	    返回类型为T的对象，包含方法：T get()
Function<T, R>	函数型接口	T	    对类型为T的对象应用操作，并返回结果。结果是R类型的对象。包含方法：R apply(T t)
Predicate<T>	判断型接口	T	    确定类型为T的对象是否满足某约束，并返回 boolean 值。包含方法：boolean test(T t)
    *
    * */
}

package com.qihang03.stream;

import com.qihang02.reference.data.EmployeeData;
import org.junit.Test;
import com.qihang02.reference.data.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: StreamTest
 * Package: com.qihang03.stream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 17:27
 * @Version 1.0
 */
public class StreamTest {
    /*
    * Java8中有两大最为重要的改变。第一个是 Lambda 表达式；另外一个则是 Stream API。
Stream API ( java.util.stream) 把真正的函数式编程风格引入到Java中。这是目前为止对Java类库最好的补充，
* 因为Stream API可以极大提供Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
*
Stream 是 Java8 中处理集合的关键抽象概念，它可以指定你希望对集合进行的操作，可以执行非常复杂的查找、过滤和映射数据等操作。
* **使用Stream API 对集合数据进行操作，就类似于使用 SQL 执行的数据库查询。
* **也可以使用 Stream API 来并行执行操作。简言之，Stream API 提供了一种高效且易于使用的处理数据的方式。
    * */
    /*
    * 为什么要使用Stream API
实际开发中，项目中多数数据源都来自于MySQL、Oracle等。但现在数据源可以更多了，有MongDB，Radis等，
* 而这些NoSQL的数据就需要Java层面去处理。
    * */
    /*
    * 什么是Stream
Stream API关注的是多个数据的计算（排序、查找、过滤、映射、遍历等），面向CPU的。集合关注的数据的存储,向下内存的。
stream API 之于集合，类似于SQL之于数据表的查询。
*
Stream 是数据渠道，用于操作数据源（集合、数组等）所生成的元素序列。
Stream 和 Collection 集合的区别：Collection 是一种静态的内存数据结构，讲的是数据，而 Stream 是有关计算的，
* 讲的是计算。前者是主要面向内存，存储在内存中，后者主要是面向 CPU，通过 CPU 实现计算。
注意：
①Stream 自己不会存储元素。
②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。即一旦执行终止操作，就执行中间操作链，并产生结果。
④Stream一旦执行了终止操作，就不能再调用其它中间操作或终止操作了。
    * */
    /*
Stream的操作三个步骤
1- Stream的实例化
一个数据源（如：集合、数组），获取一个流
2- 一系列的中间操作
每次处理都会返回一个持有结果的新Stream，即中间操作的方法返回值仍然是Stream类型的对象。
* 因此中间操作可以是个操作链，可对数据源的数据进行n次处理，但是在终结操作前，并不会真正执行。
3- 终止操作(终端操作)
终止操作的方法返回值类型就不再是Stream了，因此一旦执行终止操作，就结束整个Stream操作了。
* 一旦执行终止操作，就执行中间操作链，最终产生结果并结束Stream。
    * */
    /*
方式一：通过集合
Java8 中的 Collection 接口被扩展，提供了两个获取流的方法：
default Stream stream() : 返回一个顺序流
default Stream parallelStream() : 返回一个并行流
    * */
    @Test
    public void test01(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Employee> employeeList = EmployeeData.getEmployee();
        //JDK1.8中，Collection系列集合增加了方法
        //返回一个顺序流
        Stream<Employee> stream = employeeList.stream();
        stream.forEach(System.out::println);
        //返回一个并行流
        Stream<Employee> stream1 = employeeList.parallelStream();
//        stream.forEach(System.out::println);
        System.out.println(stream1);
    }
    /*
    * 方式二：通过数组
Java8 中的 Arrays 的静态方法 stream() 可以获取数组流：
static Stream stream(T[] array): 返回一个流
public static IntStream stream(int[] array)
public static LongStream stream(long[] array)
public static DoubleStream stream(double[] array)
    * */
    @Test
    public void test2(){
        String[] arr = {"hello","world"};
        Stream<String> stream = Arrays.stream(arr);
        String[] arr1 = {"hello","world"};
        Stream<String> stream1 = Arrays.stream(arr);
    }
    /*
    * 通过Stream的of()
可以调用Stream类静态方法 of(), 通过显示值创建一个流。它可以接收任意数量的参数。
public static Stream of(T... values) : 返回一个流
    * */
    @Test
    public void test04(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);
    }
    /*
    * 创建无限流(了解)
可以使用静态方法 Stream.iterate() 和 Stream.generate(), 创建无限流。
    迭代
    public static Stream iterate(final T seed, final UnaryOperator f)
    生成
    public static Stream generate(Supplier s)
    * */
    // 方式四：创建无限流
    @Test
    public void test05() {
        // 迭代
        // public static<T> Stream<T> iterate(final T seed, final
        // UnaryOperator<T> f)
        Stream<Integer> stream = Stream.iterate(0, x -> x + 2);
        stream.limit(10).forEach(System.out::println);

        // 生成
        // public static<T> Stream<T> generate(Supplier<T> s)
        Stream<Double> stream1 = Stream.generate(Math::random);
        stream1.limit(10).forEach(System.out::println);
    }
}

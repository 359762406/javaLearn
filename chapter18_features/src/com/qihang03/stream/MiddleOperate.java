package com.qihang03.stream;

import com.qihang02.reference.data.Employee;
import com.qihang02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: MiddleOperate
 * Package: com.qihang03.stream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 9:58
 * @Version 1.0
 */
public class MiddleOperate {
    /*
    * Stream的操作三个步骤
1- 创建 Stream
一个数据源（如：集合、数组），获取一个流
2- 中间操作
每次处理都会返回一个持有结果的新Stream，即中间操作的方法返回值仍然是Stream类型的对象。
* 因此中间操作可以是个操作链，可对数据源的数据进行n次处理，但是在终结操作前，并不会真正执行。
3- 终止操作(终端操作)
终止操作的方法返回值类型就不再是Stream了，因此一旦执行终止操作，就结束整个Stream操作了。
* 一旦执行终止操作，就执行中间操作链，最终产生结果并结束Stream。
    * */
    /*
    多个中间操作可以连接起来形成一个流水线，除非流水线上触发终止操作，否则中间操作不会执行任何的处理！
        而在终止操作时一次性全部处理，称为“惰性求值”。
    * */
    /*
    * 1-筛选与切片
方 法	            描 述
filter(Predicate p)	接收 Lambda ， 从流中排除某些元素
distinct()	        筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
limit(long maxSize)	截断流，使其元素不超过给定数量
skip(long n)	    跳过元素，返回一个扔掉了前 n 个元素的流。
                    若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
    * */
    /*
    * 2-映 射
方法	                            描述
map(Function f)	                接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
mapToDouble(ToDoubleFunction f)	接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。
mapToInt(ToIntFunction f)	    接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
mapToLong(ToLongFunction f)	    接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。
flatMap(Function f)	            接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
    * */
    /*
    * 3-排序
方法	                     描述
sorted()	             产生一个新流，其中按自然顺序排序
sorted(Comparator com)	 产生一个新流，其中按比较器顺序排序
    * */
    @Test
    public void test1(){
        //filter(Predicate p)	接收 Lambda ， 从流中排除某些元素
        List<Employee> list = EmployeeData.getEmployee();
        Stream<Employee> stream = list.stream();
        //获取工资大于7000的员工
        stream.filter(emp -> emp.getSalary() > 7000).forEach(System.out::println);
        System.out.println();

        Stream<Employee> streamLimit = list.stream();
        //截断流，使其元素不超过给定数量
        //java.lang.IllegalStateException: stream has already been operated upon or closed
        streamLimit.limit(2).forEach(System.out::println);
        System.out.println();

        Stream<Employee> FilterLimit = list.stream();
        FilterLimit.filter(emp->emp.getSalary() >7000).limit(4).forEach(System.out::println);
        System.out.println();

        list.stream().skip(3).forEach(System.out::println);
        System.out.println();
        list.add(new Employee(4, "李四", 23, 9000));
        list.add(new Employee(6, "大嘴",  23, 11000));
        list.forEach(System.out::println);
        System.out.println();
        //筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
        list.stream().distinct().forEach(System.out::println);
    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("aa","bb", "cc", "dd", "ee");
        list.stream().map(str->str.toUpperCase()).forEach(s-> System.out.println(s));
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        Stream.of(1,2,3,4,5)
                .map(t -> t + 1)//Function<T,R>接口抽象方法 R apply(T t)
                .forEach(System.out::println);

        EmployeeData.getEmployee().stream().filter(emp->emp.getName().length() > 1).forEach(System.out::println);
        EmployeeData.getEmployee()
                .stream()
                .filter(emp->emp.getName().length() > 1)
                .forEach(System.out::println);
        EmployeeData.getEmployee()
                .stream()
                .map(Employee::getName)
                .filter(name -> name.length() > 1)
                .forEach(System.out::println);

            String[] arr = {"hello","world","java"};
            Arrays.stream(arr)
                    .sorted(String::compareTo)
                    .flatMap(t -> Stream.of(t.split("|")))//Function<T,R>接口抽象方法 R apply(T t)  现在的R是一个Stream
                    .forEach(System.out::println);

    }
    @Test
    public void test3(){
        //希望能够找出前三个最大值，前三名最大的，不重复
        Stream.of(11,2,39,4,54,6,2,22,3,3,4,54,54)
                .distinct()
                .sorted((t1,t2) -> -Integer.compare(t1, t2))//Comparator接口  int compare(T t1, T t2)
                .limit(3)
                .forEach(System.out::println);
        Stream.of(11,2,39,4,54,6,2,22,3,3,4,54,54)
                .distinct()
                .sorted((e1, e2) -> e2 - e1)//Comparator接口  int compare(T t1, T t2)
                .limit(3)
                .forEach(System.out::println);
        Stream.of(11,2,39,4,54,6,2,22,3,3,4,54,54)
                .distinct()
                .sorted((e1, e2) -> -e1.compareTo(e2))//Comparator接口  int compare(T t1, T t2)
                .limit(3)
                .forEach(System.out::println);
    }



}

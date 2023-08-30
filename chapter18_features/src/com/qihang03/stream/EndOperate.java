package com.qihang03.stream;

import com.qihang02.reference.data.Employee;
import com.qihang02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: EndOperate
 * Package: com.qihang03.stream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 11:18
 * @Version 1.0
 */
public class EndOperate {
    /*
    * 终止操作
终端操作会从流的流水线生成结果。其结果可以是任何不是流的值，例如：List、Integer，甚至是 void 。
流进行了终止操作后，不能再次使用。
    * */
    /*
1-匹配与查找
方法	                    描述
allMatch(Predicate p)	检查是否匹配所有元素
anyMatch(Predicate p) 检查是否至少匹配一个元素
noneMatch(Predicate p)	检查是否没有匹配所有元素
findFirst()      	返回第一个元素
findAny()	        返回当前流中的任意元素
count()	            返回流中元素总数
max(Comparator c)	返回流中最大值
min(Comparator c)	返回流中最小值
forEach(Consumer c)	内部迭代(使用 Collection 接口需要用户去做迭代，称为外部迭代。
                     相反，Stream API 使用内部迭代——它帮你把迭代做了)
* 2-归约
方法	                                    描述
reduce(T identity, BinaryOperator b)	可以将流中元素反复结合起来，得到一个值。返回 T
reduce(BinaryOperator b)	            可以将流中元素反复结合起来，得到一个值。返回 Optional
备注：map 和 reduce 的连接通常称为 map-reduce 模式，因 Google 用它来进行网络搜索而出名。
3-收集
方 法	                描 述
collect(Collector c)	将流转换为其他形式。接收一个 Collector接口的实现，
                         用于给Stream中元素做汇总的方法
Collector 接口中方法的实现决定了如何对流执行收集的操作(如收集到 List、Set、Map)。
另外， Collectors 实用类提供了很多静态方法，可以方便地创建常见收集器实例，具体方法与实例如下表：

方法	          返回类型	         作用
toList	Collector<T, ?, List>	把流中元素收集到List
List<Employee> emps= list.stream().collect(Collectors.toList());

toSet	Collector<T, ?, Set>	把流中元素收集到Set
Set<Employee> emps= list.stream().collect(Collectors.toSet());

toCollection	Collector<T, ?, C>	把流中元素收集到创建的集合
Collection<Employee> emps =list.stream().collect(Collectors.toCollection(ArrayList::new));

counting	Collector<T, ?, Long>	计算流中元素的个数
long count = list.stream().collect(Collectors.counting());

summingInt	Collector<T, ?, Integer>	对流中元素的整数属性求和
int total=list.stream().collect(Collectors.summingInt(Employee::getSalary));

averagingInt	Collector<T, ?, Double>	计算流中元素Integer属性的平均值
double avg = list.stream().collect(Collectors.averagingInt(Employee::getSalary));

summarizingInt	Collector<T, ?, IntSummaryStatistics>	收集流中Integer属性的统计值。如：平均值
int SummaryStatisticsiss= list.stream().collect(Collectors.summarizingInt(Employee::getSalary));

joining	Collector<CharSequence, ?, String>	连接流中每个字符串
String str= list.stream().map(Employee::getName).collect(Collectors.joining());

maxBy	Collector<T, ?, Optional>	根据比较器选择最大值
Optional<Emp>max= list.stream().collect(Collectors.maxBy(comparingInt(Employee::getSalary)));

minBy	Collector<T, ?, Optional>	根据比较器选择最小值
Optional<Emp> min = list.stream().collect(Collectors.minBy(comparingInt(Employee::getSalary)));

reducing	Collector<T, ?, Optional>	从一个作为累加器的初始值开始，利用BinaryOperator与流中元素逐个结合，从而归约成单个值
int total=list.stream().collect(Collectors.reducing(0, Employee::getSalar, Integer::sum));

collectingAndThen	Collector<T,A,RR>	包裹另一个收集器，对其结果转换函数
int how= list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), List::size));

groupingBy	Collector<T, ?, Map<K, List>>	根据某属性值对流分组，属性为K，结果为V
Map<Emp.Status, List<Emp>> map= list.stream().collect(Collectors.groupingBy(Employee::getStatus));

partitioningBy	Collector<T, ?, Map<Boolean, List>>	根据true或false进行分区
Map<Boolean,List<Emp>> vd = list.stream().collect(Collectors.partitioningBy(Employee::getManage
    * */
    @Test
    public void test1() {
        System.out.println(EmployeeData.getEmployee().stream().allMatch(emp -> emp.getAge() > 18));
        System.out.println(EmployeeData.getEmployee().stream().anyMatch(emp -> emp.getAge() > 18));
        System.out.println(EmployeeData.getEmployee().stream()
                .map(Employee::getSalary)
                .filter(salary -> salary > 10000.0)
                .count());
        System.out.println(EmployeeData.getEmployee().stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get().getName());
        System.out.println(EmployeeData.getEmployee().stream()
                .map(Employee::getSalary)
                .max(Double::compareTo)
                .get());
        System.out.println(EmployeeData.getEmployee().stream()
                .min(Comparator.comparingDouble(Employee::getSalary)).get().getName());
        System.out.println(EmployeeData.getEmployee().stream()
                .map(Employee::getSalary)
                .min(Double::compareTo)
                .get());
        //针对于List来说，遍历的方式:①使用Iterator②增强for③一般for ④ forEach()
    }
    @Test
    public void test2(){
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //reduce(T identity, BinaryOperator b)
        //BinaryOperator R apply(T t, U u);
        //identity 初始值
        System.out.println(integerList.stream().reduce(0, Integer::sum));
    }
    @Test
    public void test3(){
        List<Employee> employeeList = EmployeeData.getEmployee().stream().filter(emp -> emp.getSalary() > 10000).collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        EmployeeData.getEmployee().stream().sorted((e1,e2)->e1.getAge()- e2.getAge()).collect(Collectors.toList()).forEach(System.out::println);

    }
    @Test
    public void test4(){
        /*
        * ofNullable()的使用：
Java 8 中 Stream 不能完全为null，否则会报空指针异常。
* 而 Java 9 中的 ofNullable 方法允许我们创建一个单元素 Stream，可以包含一个非空元素，也可以创建一个空 Stream。
        * */
        //报NullPointerException
//Stream<Object> stream1 = Stream.of(null);
//System.out.println(stream1.count());

//不报异常，允许通过
        Stream<String> stringStream = Stream.of("AA", "BB", null);
        System.out.println(stringStream.count());//3

//不报异常，允许通过
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add(null);
        System.out.println(list.stream().count());//2
//ofNullable()：允许值为null
        Stream<Object> stream1 = Stream.ofNullable(null);
        System.out.println(stream1.count());//0

        Stream<String> stream = Stream.ofNullable("hello world");
        System.out.println(stream.count());//1
        //原来的控制终止方式：
        Stream.iterate(1,i -> i + 1).limit(10).forEach(System.out::println);

//现在的终止方式：
        Stream.iterate(1,i -> i < 100,i -> i + 1).forEach(System.out::println);
    }
    






}

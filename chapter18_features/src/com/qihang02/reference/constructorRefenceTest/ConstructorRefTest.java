package com.qihang02.reference.constructorRefenceTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: ConstructorRefTest
 * Package: com.qihang02.reference
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 16:36
 * @Version 1.0
 */
public class ConstructorRefTest {
    /*
   当Lambda表达式是创建一个对象，并且满足Lambda表达式形参，正好是给创建这个对象的构造器的实参列表，就可以使用构造器引用。
   格式：类名::new
    * */
//构造器引用
    //Supplier中的T get()
    //Employee的空参构造器：Employee()
    @Test
    public void test1(){

        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println("*******************");

        Supplier<Employee>  sup1 = () -> new Employee();
        System.out.println(sup1.get());

        System.out.println("*******************");

        Supplier<Employee>  sup2 = Employee :: new;
        System.out.println(sup2.get());
    }

    //Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> func1 = id -> new Employee(id);
        Employee employee = func1.apply(1001);
        System.out.println(employee);

        System.out.println("*******************");

        Function<Integer,Employee> func2 = Employee :: new;
        Employee employee1 = func2.apply(1002);
        System.out.println(employee1);

    }

    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer, String, Employee> func = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer integer, String s) {
                return new Employee(integer, s);
            }
        };
        System.out.println(func.apply(1001,"Tom"));
        BiFunction<Integer,String,Employee> func1 = (id, name) -> new Employee(id,name);
        System.out.println(func1.apply(1001,"Tom"));

        System.out.println("*******************");

        BiFunction<Integer,String,Employee> func2 = Employee :: new;
        System.out.println(func2.apply(1002,"Tom"));

    }
    /*
数组构造引用
当Lambda表达式是创建一个数组对象，并且满足Lambda表达式形参，正好是给创建这个数组对象的长度，就可以数组构造引用。
格式：数组类型名::new
    * */
    //数组引用
//Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer, Employee[]> func = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer integer) {
                return new Employee[integer];
            }
        };
        Function<Integer,Employee[]> func1 = length -> new Employee[length];
        Employee[] arr1 = func1.apply(5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("*******************");

        Function<Integer,Employee[]> func2 = Employee[] :: new;
        Employee[] arr2 = func2.apply(10);
        System.out.println(func2.apply(30).length);
        System.out.println(Arrays.toString(arr2));

    }
}

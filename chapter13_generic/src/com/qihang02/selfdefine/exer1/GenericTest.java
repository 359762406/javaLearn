package com.qihang02.selfdefine.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    /*
    * 1.2使用说明
    * 我们在声明完自定义泛型类以后，可以在类的内部（比如:属性、方法、构造器中）使用类的泛型。
    * 我们在创建自定义泛型类的对象时，可以指明泛型参数类型。一旦指明，内部凡是使用类的泛型参数的位置，都具体化为指定的泛型参数
    * 如果在创建自定义泛型类的对象时，没有指明泛型参数类型，那么泛型将被擦除，泛型对应的类型均按照Object处理，但是不等价与Object
    * –经验:泛型要使用一路都用。要不用，一路都不要用。
    * 泛型的指定中必须使用引用数据类型。不能使用基本数据类型，此时只能使用包装类替换。
    * ⑤
    * 除创建泛型类对象外，子类继承泛型类时、实现类实现泛型接口时，也可以确定泛型结构中的泛型参数。比如: SubOrder2
    * 如果我们在给泛型类提供子类时，子类也不确定泛型的类型，则可以继续使用泛型参数。比如:SubOrder3
    * 我们还可以在现有的类的泛型参数的基础上，新增泛型参数。比如:Sub0rder5
    * */
    /*
    * 注意
    ① 泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如：<E1,E2,E3>

    ② JDK7.0 开始，泛型的简化操作：ArrayList flist = new ArrayList<>();

    ③ 如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象。

    ④ 不能使用new E[]。但是可以：E[] elements = (E[])new Object[capacity];

    参考：ArrayList源码中声明：Object[] elementData，而非泛型参数类型数组。

    ⑤ 在类/接口上声明的泛型，在本类或本接口中即代表某种类型，但不可以在静态方法中使用类的泛型。

    ⑥ 异常类不能是带泛型的。
    *
    * */
    @Test
    public void test6(){
        Person<String> person = new Person<>();
        Integer[] arr = new Integer[]{1,2,2,3,4};
        ArrayList<Integer> List = person.copyFromArrayToList(arr);
        System.out.println(List);
        ArrayList<Integer> arrayList = Person.copyFromArrayToListStatic(arr);
        System.out.println(arrayList);
    }



}

package com.qihang17.block.exer;

/**
 * ClassName: BlockTest
 * Package: com.qihang17.block.exer
 * Description:
 *  静态代码块
 *  >随着类的加载而执行
 *  >由于类的加载只会执行一次，故静态代码块只会执行一次
 *  >作用：用来初始化类的信息
 *  >内部可以声明变量、调用属性或方法、编写输出语句等操作。
 *  >静态代码块的执行要先于非静态代码块的执行
 *  >如果声明有多个静态代码块，则按照声明的先后顺序执行
 *  >静态代码块内部只能调用静态的结构（即静态的属性、方法)，不能调用非静态的结构（即非静态的属性、方法)
 *
 *
 *
 *  非静态代码块
 *  >随着对象的创建而执行
 *  >每创建当前类的一个实例，就会执行一次非静态代码块
 *  >用来初始化对象信息
 *  >内部可以声明变量、调用属性或方法、编写输出语句等操作。
 *  >如果声明有多个非静态代码块，则按照声明的先后顺序执行
 *  >非静态代码块内部可以调用静态的结构〈即静态的属性、方法），也可以调用非静态的结构（即非静态的属性、方法)
 * @Author 刘起航
 * @Create 2023/7/20 20:57
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.eat();
        System.out.println(Person.info);
    }
}
class Person{
    String name;
    int age;
    static String info = "我是一个人";
    public Person() {
    }

    public void eat(){
        System.out.println("人吃饭");
    }
    {
        System.out.println("非静态代码块1");
    }

    static{
        System.out.println("静态代码块");
    }
}

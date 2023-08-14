package com.qihang17.block.exer1;

/**
 * ClassName: FieldTest
 * Package: com.qihang17.block.exer1
 * Description:
 * 可以给类的非静态的属性（即实例变量）赋值的位置有:
 * 1.默认初始化
 * 2.显式初始化 / 4.代码块中初始化
 * 3.构造器中初始化
 * 5.有了对象以后，通过"对象.属性"或"对象.方法"的方法进行赋值
 * 执行的先后顺序:1 - 2/4 - 3 - 5
 *
 *  非静态代码块和构造器组成<init>方法
 *3．(超纲)关于字节码文件中的<init>的简单说明:(通过插件jclasslib bytecode viewer查看)
 *  > <init>方法在字节码文件中可以看到。每个<init>方法都对应着一个类的构造器。(类中声明了几个构造器就会有几个<init>)
 *  > 编写的代码中的构造器在编译以后就会以<init>方法的方式呈现
 *  > <init>方法内部的代码包含了实例变量的显示赋值、代码块中的赋值和构造器中的代码。
 *  > <init>方法用来初始化当前创建的对象的信息的。
 *
 *  由父及子，静态先行。
 *
 * @Author 刘起航
 * @Create 2023/7/20 22:18
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}
class Order{
    int orderId = 1;  // 1

    {
        this.orderId = 2; // 2
    }

    public Order() {
        super();
        this.orderId = 3; // 3
    }
}
class Order1{
    {
        this.orderId = 2; // 1
    }
    int orderId = 1;  // 2



    public Order1() {
        super();
        this.orderId = 3; // 3
    }
}
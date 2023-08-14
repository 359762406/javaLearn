package com.qihang13._polymorphism.exer1;



/**
 * ClassName: PersonTest
 * Package: com.qihang13._polymorphism.exer1
 * Description:
 *      多态性的应用:虚拟方法调用
 *
 *      在多态的场景下，调用方法时。
 *      编译时，认为方法是左边声明的父类的类型的方法（即被重写的方法)执行式，实际执行的是子类重写父类的方法。
 *      编译看左边，运行看右边
 *
 *      前提:1.类的继承关系  2.方法的重写
 *
 *      适用性： 只适用于方法
 *
 *      好处：极大地减少了代码的冗余，不需要定义多个重载的方法
 *      弊端：虽然创建的对象，在内存中加载了子类中声明的特有的属性和方法题，
 *             但是由于声明为父类地引用，导致我们没有办法不能直接调用子类中加载的特有的属性和方法呢
 *
 * @Author 刘起航
 * @Create 2023/7/19 15:57
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Man(13, "tom");
        p1.eat();
        p1.sleep();
        System.out.println(p1.i); //属性不满足多态性
        Man m1 = new Man(13, "tom");
        System.out.println(p1.equals(m1));
        System.out.println(p1 instanceof Man);
        System.out.println(m1 instanceof Man);
    }
}

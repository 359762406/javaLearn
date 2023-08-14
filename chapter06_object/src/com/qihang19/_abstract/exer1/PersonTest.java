package com.qihang19._abstract.exer1;

/**
 * ClassName: PersonTest
 * Package: com.qihang19._abstract.exer1
 * Description:
 *抽象类不能创建对象，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象。
 *
 * 理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义。
 *
 * 抽象类是用来被继承的，抽象类的子类必须重写父类的抽象方法，并提供方法体。若没有重写全部的抽象方法，仍为抽象类。
 *
 * 抽象类中，也有构造方法，是供子类创建对象时，初始化父类成员变量使用的。
 *
 * 理解：子类的构造方法中，有默认的super()或手动的super(实参列表)，需要访问父类构造方法。
 *
 * 抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *
 * 理解：未包含抽象方法的抽象类，目的就是不想让调用者创建该类对象，通常用于某些特殊的类结构设计。
 *
 * 抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类。
 *
 * 理解：假设不重写所有抽象方法，则类中可能包含抽象方法。那么创建对象后，调用抽象的方法，没有意义。
 *
 * 注意事项
 * 不能用abstract修饰变量、代码块、构造器；
 * 不能用abstract修饰私有方法、静态方法、fi nal的方法、final的类。
 * @Author 刘起航
 * @Create 2023/7/21 14:39
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person p1 = new Student();
//        p1.eat();
        Student stu = new Student();
        stu.eat();
    }
}

package com.qihang19._abstract.exer1;

/**
 * ClassName: Person
 * Package: com.qihang19._abstract.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/21 11:58
 * @Version 1.0
 */
public abstract class Person { // 抽象类，不能实例化
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
    public abstract void sleep();
}

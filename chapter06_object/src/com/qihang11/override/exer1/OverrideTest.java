package com.qihang11.override.exer1;

/**
 * ClassName: OverrideTest
 * Package: com.qihang11.override.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 9:34
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Student stu = new Student();
        Person p1  = new Person();
        p1.eat();
        stu.eat();
    }
}

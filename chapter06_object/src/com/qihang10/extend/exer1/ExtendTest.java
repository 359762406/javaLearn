package com.qihang10.extend.exer1;

/**
 * ClassName: ExtendTest
 * Package: com.qihang10.extend.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:14
 * @Version 1.0
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sleep();
        p1.eat();

        Student stu1 = new Student();
        stu1.eat();
        stu1.sleep();
        stu1.study();
    }
}

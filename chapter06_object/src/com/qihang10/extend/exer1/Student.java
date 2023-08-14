package com.qihang10.extend.exer1;

/**
 * ClassName: Student
 * Package: com.qihang10.extend.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:13
 * @Version 1.0
 */
public class Student extends Person{
    public String  school;
    public void study(){
        System.out.println("学生学习"  + getAge());
    }
}

package com.qihang11.override.exer1;


/**
 * ClassName: Student
 * Package: com.qihang10.extend.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:13
 * @Version 1.0
 */
public class Student extends Person {
    public String  school;
    public void study(){
        System.out.println("学生学习"  + getAge());
    }
    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }
    @Override
    public int returnTest(int num){
        return num + 1;
    }
    @Override
    public Student returnTest(){
        return null;
    }
}

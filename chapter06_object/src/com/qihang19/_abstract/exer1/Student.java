package com.qihang19._abstract.exer1;

/**
 * ClassName: School
 * Package: com.qihang19._abstract.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/21 12:01
 * @Version 1.0
 */
public class Student extends Person {
    String School;

    public Student() {
    }

    public Student(String school) {
        School = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        School = school;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }
    public void sleep(){
        System.out.println("学生要保证充足的睡眠");
    }
}

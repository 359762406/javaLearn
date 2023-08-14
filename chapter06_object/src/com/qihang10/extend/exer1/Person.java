package com.qihang10.extend.exer1;

/**
 * ClassName: Person
 * Package: com.qihang10.extend.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:11
 * @Version 1.0
 */
public class Person {
    //属性
    private String name;
    private int age;
    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

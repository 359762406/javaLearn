package com.qihang01.example;

/**
 * ClassName: Person
 * Package: com.qihang01.example
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 15:09
 * @Version 1.0
 */
public class Person {
    private String name;
    public int age;
    public Person(){
        System.out.println("Person()....");
    }
    public Person(int age){
        this.age = age;
    }
    private Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("I an a person.");
    }
    private String showNation(String nation){
        return this.name + "的国籍是：" + nation ;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

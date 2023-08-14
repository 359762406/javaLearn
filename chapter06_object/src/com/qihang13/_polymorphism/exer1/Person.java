package com.qihang13._polymorphism.exer1;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.qihang13._polymorphism.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 15:46
 * @Version 1.0
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
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

    int i = 1000;
    public void sleep(){
        System.out.println("人睡觉");
    }
    public void eat(){
        System.out.println("人吃饭");
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof Person){
//            Person p1 = (Person)obj;
//            return p1.getAge() == this.getAge() && this.getName().equals(p1.getName());
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

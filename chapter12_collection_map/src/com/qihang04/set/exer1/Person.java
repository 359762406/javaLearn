package com.qihang04.set.exer1;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.qihang04.set.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 10:19
 * @Version 1.0
 */
public class Person implements Comparable{
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compareTo...");
        if (this == o){
            return 0;
        }
        if (o instanceof Person){
            Person person = (Person) o;
            int value = this.age - person.age;
            if (value != 0){
                return value;
            }else{
                return -this.name.compareTo(person.name);
            }
        }
        throw new RuntimeException("类型不匹配");
    }
}

package com.qihang03.stream.exer;

/**
 * ClassName: Person
 * Package: com.qihang03.stream.exer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 14:58
 * @Version 1.0
 */
public class Person {
    private String name;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

}

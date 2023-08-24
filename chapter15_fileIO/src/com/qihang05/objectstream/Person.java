package com.qihang05.objectstream;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: com.qihang05.objectstream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 17:31
 * @Version 1.0
 */
public class Person implements Serializable {
    /*
     * 1.自定义类要实现Serializable接口\
     * 2.声明一个全局常量
     * 3.要求自定义类的各个属性也必须是可序列化的。
        >对于基本数据类型的属性。默认就是可以序列化的
        >对于引用数据类型的属性。要求实现Serializable接口
注意点:
如果不声明全局常量serialVersionUID，系统会自动声明生成一个针对于当前类的serialVersionUID。如果修改此类的话，会导致serialVersionUID变化，
*   进而导致反序列化时，出现InvalidClassException异常。
②类中的属性如果声明为transient或static，则不会实现序列化。

     * */
    private final static long serialVersionUID = 131231314L;
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
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}

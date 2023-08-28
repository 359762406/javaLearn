package com.qihang03.reflectapply.apply3;

/**
 * ClassName: Student
 * Package: com.qihang03.reflectapply.apply3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 10:30
 * @Version 1.0
 */
public class Student {
    private int id;
    private String name;
    private static String info;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    private String showNation(String name, int age){
        return this.name + "的国籍是" + ":" + name + ", 现在" + age + "岁";
    }
}

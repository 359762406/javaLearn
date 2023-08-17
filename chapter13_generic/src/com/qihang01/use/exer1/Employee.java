package com.qihang01.use.exer1;

/**
 * ClassName: Employee
 * Package: com.qihang01.use.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:18
 * @Version 1.0
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate myDate;

    public Employee() {
    }

    public Employee(String name, int age, MyDate myDate) {
        this.name = name;
        this.age = age;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }



    @Override
    public String toString() {
        return "姓名:" + name +  "年龄:"+ age +
                "生日:" + myDate.toString();
    }

    @Override
    public int compareTo(Employee o) {
        return -o.getName().compareTo(this.getName());
    }
}

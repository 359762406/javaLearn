package com.qihang02.reference.data;

/**
 * ClassName: Employee
 * Package: com.qihang01.lambda.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:54
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    public Employee(int id, String name, int age, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public Employee() {
        super();
    }
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

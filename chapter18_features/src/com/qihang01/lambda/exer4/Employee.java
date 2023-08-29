package com.qihang01.lambda.exer4;

/**
 * ClassName: Employee
 * Package: com.qihang01.lambda.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:30
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(int id, String name, char gender, int age, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }
    public Employee() {
        super();
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
                + "]";
    }
}

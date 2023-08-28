package com.qihang04.other.annotation;

/**
 * ClassName: Customer
 * Package: com.qihang04.other
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 11:47
 * @Version 1.0
 */
@Table(value = "t_customers")
public class Customer {
    @Column(columnName = "cust_name",columnType = "varchar(15)")
    private String name;
    @Column(columnName = "cust_age",columnType = "int")
    private int age;
    public Customer(){
        System.out.println("Customer()....");
    }

    public Customer(int age) {
        this.age = age;
    }

    private Customer(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

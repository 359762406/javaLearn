package com.qihang14.object.euqals.exer2;

import java.util.Objects;

/**
 * ClassName: Customer
 * Package: com.qihang14.object.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:32
 * @Version 1.0
 */
public class Customer {
    private String name;
    private int age;
    private Account acct;

    public Customer() {
    }

    public Customer(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
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

    public Account getAcct() {
        return acct;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(acct, customer.acct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, acct);
    }
}

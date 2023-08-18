package com.qihang02.selfDefine.apply;

import java.sql.Date;
import java.util.Objects;

/**
 * ClassName: Customer
 * Package: com.qihang02.selfdefine.apply
 * Description:
 *  ORM 对象关系映射
 *
 *  数据库中的一个表与Java中的一个类对应
 *  表中的一条记录与Java类的一个对象对应
 *  表中的一个字段(或列)与Java类的一个属性（或字段〉对应
 * @Author 刘起航
 * @Create 2023/8/18 14:53
 * @Version 1.0
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birth;

    public Customer() {
    }

    public Customer(int id, String name, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(birth, customer.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birth);
    }
}

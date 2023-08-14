package com.qihang14.object.euqals.exer2;

/**
 * ClassName: CustomerTest
 * Package: com.qihang14.object.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:34
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 18, new Account(2000.0));
        Customer c2 = new Customer("Tom", 18, new Account(2000.0));
        System.out.println(c2.equals(c1));
    }
}

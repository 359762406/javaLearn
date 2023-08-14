package com.qihang08.constructor.exer1;

/**
 * ClassName: CustomerTest
 * Package: com.qihang08.constructor.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/17 21:07
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("jane", "smith");

        Account account  = new Account(1000, 2000, 0.0123);

        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withDraw(960);
        customer.getAccount().withDraw(2000);
    }
}

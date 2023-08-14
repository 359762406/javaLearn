package com.qihang15._static.exer3;

/**
 * ClassName: AccountTest
 * Package: com.qihang15._static.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 16:34
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1.toString());
        Account acc2 = new Account("123456", 2000.0);
        System.out.println(acc2.toString());
        Account.setInterestRate(0.123);
        Account.setMinBalance(10);
        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBalance());
    }
}

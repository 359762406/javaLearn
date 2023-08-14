package com.qihang15._static.exer3;

/**
 * ClassName: Account
 * Package: com.qihang15._static.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 16:29
 * @Version 1.0
 */
public class Account {
    private int id;
    private String password; // 密码

    private double balance; // 余额

    private static double interestRate; // 利率
    private static double minBalance = 1; // 最小余额
    private static int init = 1001; //用于自动生成id

    public Account() {
        this.id = init;
        init ++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this.id = init;
        init ++;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}

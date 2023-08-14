package com.qihang08.constructor.exer1;

/**
 * ClassName: Account
 * Package: com.qihang08.constructor.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/17 20:39
 * @Version 1.0
 */
public class Account {
    private int id; // 账号
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    public Account(int i, double b, double a){
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
    public void setBalance(int b){
        balance = b;
    }

    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(int a){
        annualInterestRate = a;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void withDraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Successfully!\n" + "Now your account has " + balance);
        }else{
            System.out.println("no enough money");
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Successfully!\n" + "Now your account has " + balance);
        }else{
            System.out.println("illegal input");
        }
    }
}

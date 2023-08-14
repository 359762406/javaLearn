package com.qihang08.constructor.exer1;

/**
 * ClassName: Customer
 * Package: com.qihang08.constructor.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/17 21:02
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String fN, String lN){
        firstName = fN;
        lastName = lN;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }

    public void setAccount(Account a){
        account = a;
    }
}

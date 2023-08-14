package com.qihang17.block.exer1;

/**
 * ClassName: User
 * Package: com.qihang17.block.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 21:28
 * @Version 1.0
 */
public class User{
    private String userName;
    private String password;
    private long registrationTime;
    {
        System.out.println("新用户注册");
        this.registrationTime = System.currentTimeMillis();
    }
    public User() {

        this.userName = System.currentTimeMillis() + "";
        this.password = "123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(long registrationTime) {
        this.registrationTime = registrationTime;
    }
}

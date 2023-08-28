package com.qihang03.reflectapply.exer;

/**
 * ClassName: User
 * Package: com.qihang03.reflectapply.exer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 15:02
 * @Version 1.0
 */
public class User {
    private String name;
    public User(){

    }

    public User(String name) {
        this.name = name;
    }
    public String show(){
        return "I'm " + this.name;
    }
}

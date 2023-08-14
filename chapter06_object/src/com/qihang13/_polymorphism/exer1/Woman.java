package com.qihang13._polymorphism.exer1;


/**
 * ClassName: sout
 * Package: com.qihang13._polymorphism.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 15:56
 * @Version 1.0
 */
public class Woman extends Person {
    int i = 1002;
    @Override
    public void sleep(){
        System.out.println("女人睡觉");
    }
    @Override
    public void eat(){
        System.out.println("女人吃饭");
    }
    public void shopping(){
        System.out.println("女人购物");
    }
}

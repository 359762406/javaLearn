package com.qihang13._polymorphism.exer1;



/**
 * ClassName: Man
 * Package: com.qihang13._polymorphism.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 15:55
 * @Version 1.0
 */
public class Man extends Person {
    int i = 1001;
    boolean isSmoking = false;



    @Override
    public void sleep(){
        System.out.println("男人睡觉");
    }

    public Man() {
    }

    public Man(int age, String name) {
        super(age, name);

    }

    @Override
    public void eat(){
        System.out.println("男人吃饭");
    }
    public void earnMoney(){
        System.out.println("男人赚钱");
    }
}

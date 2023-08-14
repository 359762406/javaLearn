package com.qihang01.opp;

/**
 * ClassName: Phone
 * Package: com.qihang01.opp
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/14 10:12
 * @Version 1.0
 */
public class Phone {
    //属性
    String brand;
    double price;

    //方法
    public void call(){
        System.out.println("手机可以拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("send message" + message);
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }

}

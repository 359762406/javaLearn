package com.qihang01.opp;

/**
 * ClassName: PhoneTest
 * Package: com.qihang01.opp
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/14 10:17
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        //create Phone object
        Phone p1 = new Phone();

        p1.brand = "huawei";
        p1.price = 6999;
        System.out.println("name is " + p1.brand + " price is "+ p1.price);

        p1.call();
        p1.sendMessage("123312");
        p1.playGame();
    }
}

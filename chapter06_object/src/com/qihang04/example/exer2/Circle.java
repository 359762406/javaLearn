package com.qihang04.example.exer2;

/**
 * ClassName: Circle
 * Package: com.qihang04.example.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 10:51
 * @Version 1.0
 */
public class Circle {

    double pi = 3.14;
    double radius;
    public double findArea(){
        return pi * radius * radius;
    }

    public double findCircuit(){
        return 2 * radius * pi;
    }
}

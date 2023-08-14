package com.qihang04.example.exer2;

/**
 * ClassName: CircleTest
 * Package: com.qihang04.example.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 10:54
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 4.2;
        System.out.println(c1.findArea());



        System.out.println(c1.findCircuit());
    }
}

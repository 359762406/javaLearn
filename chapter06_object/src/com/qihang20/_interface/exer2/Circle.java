package com.qihang20._interface.exer2;

/**
 * ClassName: Circle
 * Package: com.qihang20._interface.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:12
 * @Version 1.0
 */
public class Circle {
    private double Radius; // 半径

    public Circle() {
    }

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}

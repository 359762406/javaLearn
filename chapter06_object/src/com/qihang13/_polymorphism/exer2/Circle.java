package com.qihang13._polymorphism.exer2;

/**
 * ClassName: Circle
 * Package: com.qihang13._polymorphism.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 16:58
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }
}

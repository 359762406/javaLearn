package com.qihang10.extend.exer3;

/**
 * ClassName: Circle
 * Package: com.qihang10.extend.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:46
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * this.getRadius() * this.getRadius();
    }
}

package com.qihang14.object.tostring.exer3;

/**
 * ClassName: Circle
 * Package: com.qihang14.object.tostring.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 10:09
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
//        this.color = "white";
//        this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
//        this.color = "white";
//        this.weight = 1.0;
        this.radius = radius;
    }

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
    public double findArea(){
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Circle){
            Circle c1 = (Circle) obj;
            return c1.getRadius() == this.getRadius() ;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}

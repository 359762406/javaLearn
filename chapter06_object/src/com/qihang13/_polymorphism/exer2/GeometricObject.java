package com.qihang13._polymorphism.exer2;

/**
 * ClassName: GeometricObject
 * Package: com.qihang13._polymorphism.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 16:55
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}

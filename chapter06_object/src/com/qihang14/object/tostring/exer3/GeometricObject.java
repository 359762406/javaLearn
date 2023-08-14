package com.qihang14.object.tostring.exer3;

/**
 * ClassName: GeometricObject
 * Package: com.qihang14.object.tostring.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 10:07
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
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
}

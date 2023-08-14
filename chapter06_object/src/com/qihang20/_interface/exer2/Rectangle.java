package com.qihang20._interface.exer2;

/**
 * ClassName: Rectangle
 * Package: com.qihang20._interface.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:33
 * @Version 1.0
 */
public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double findArea(){
        return this.height * this.width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

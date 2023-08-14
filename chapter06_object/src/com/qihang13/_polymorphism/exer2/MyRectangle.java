package com.qihang13._polymorphism.exer2;

/**
 * ClassName: MyRectangle
 * Package: com.qihang13._polymorphism.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 17:02
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return this.getWidth() * this.getHeight();
    }
}

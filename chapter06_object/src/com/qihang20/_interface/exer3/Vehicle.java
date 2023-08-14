package com.qihang20._interface.exer3;

/**
 * ClassName: Vehicle
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:50
 * @Version 1.0
 */
public abstract class Vehicle { // 不能实例化
    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void run();
}

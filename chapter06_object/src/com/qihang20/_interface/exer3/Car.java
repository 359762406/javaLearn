package com.qihang20._interface.exer3;

/**
 * ClassName: Car
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:50
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower {
    private String carNumber;
    public Car() {
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("内燃车通过燃料发动机驱动行驶");

    }

    @Override
    public void power() {
        System.out.println("内燃车通过燃油驱动");

    }
}

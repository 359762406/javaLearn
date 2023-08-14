package com.qihang20._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:50
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车通过电机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车通过电力驱动");

    }
}

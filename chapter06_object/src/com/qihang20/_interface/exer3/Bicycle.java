package com.qihang20._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:50
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    public Bicycle() {
    }

    @Override
    public void run() {
        System.out.println("自行车脚踏");
    }
}

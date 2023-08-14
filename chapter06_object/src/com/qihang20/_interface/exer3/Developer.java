package com.qihang20._interface.exer3;

/**
 * ClassName: Developer
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:53
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public Developer() {
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}

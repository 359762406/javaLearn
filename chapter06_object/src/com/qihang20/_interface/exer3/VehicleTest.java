package com.qihang20._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.qihang20._interface.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 16:29
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("奔驰", "black", "AAAVVV");
        vehicles[1] = new ElectricVehicle("white", "ADADAD");
        vehicles[2] = new Bicycle("red", "ADADAD");
        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if (vehicles[i] instanceof IPower v1){
                v1.power();
            }
        }

    }
}

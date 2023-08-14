package com.qihang20._interface.exer1;

/**
 * ClassName: UsbTest
 * Package: com.qihang20._interface.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 10:50
 * @Version 1.0
 */
public class UsbTest {
    public static void main(String[] args) {
        //1. 创建接口实现类的对象
        Computer C1 = new Computer();
        Camera camera1 = new Camera();
        C1.transferDate(camera1);
        //2.创建接口实现类的匿名对象
        C1.transferDate(new Printer());

        //3.创建接口匿名实现类的对象
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("U盘传输开始");

            }

            @Override
            public void stop() {
                System.out.println("U盘传输结束");

            }
        };
        C1.transferDate(usb1);
        //4.创建接口匿名实现类的匿名对象
        C1.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪传输开始");

            }

            @Override
            public void stop() {
                System.out.println("扫描仪传输结束");

            }
        });
    }
}

class Computer{
    public void transferDate(USB usb){
        System.out.println("设备链接成功,USB开始传输");
        usb.start();
        System.out.println("USB传输中");
        usb.stop();
        System.out.println("USB传输结束");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机传输开始");
    }

    @Override
    public void stop() {
        System.out.println("打印机传输结束");

    }
}
class Camera implements USB{

    @Override
    public void start() {
        System.out.println("相机传输照片开始");
    }

    @Override
    public void stop() {
        System.out.println("相机传输照片结束");

    }
}
interface USB{
    //声明常量
    //USB的长宽高


    //方法
    public abstract void start();
    public abstract void stop();
}

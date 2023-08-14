package com.qihang15._static.exer2;

/**
 * ClassName: CircleTest
 * Package: com.qihang15._static.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 15:33
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        System.out.println(Circle.total);
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println(Circle.total);
        Circle c2 = new Circle();
        System.out.println(c2.toString());
        System.out.println(Circle.total);
        Circle c3 = new Circle();
        System.out.println(c3.toString());
        System.out.println(Circle.total);
        Circle c4 = new Circle();
        System.out.println(c4.toString());
        System.out.println(Circle.total);
        Circle c5 = new Circle(2.34);
        System.out.println(c5.toString());
        System.out.println(Circle.total);
    }




}

class Circle{
    private double radius; //实例变量
    private static int init = 1001;
    private int id;//编号
    static int total;//创建的Circle实例的个数

    public Circle() {
        this.id  = init;
        init ++;
        total ++;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.id  = init;
        init ++;
        total ++;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
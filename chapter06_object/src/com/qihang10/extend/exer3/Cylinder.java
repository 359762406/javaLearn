package com.qihang10.extend.exer3;

/**
 * ClassName: Cylinder
 * Package: com.qihang10.extend.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:49
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;



    public Cylinder(double length, double radius) {
        super(radius);
        this.length = length;
    }

//    public Cylinder() {
//        super();
//    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return this.findArea() * this.length;
    }
}

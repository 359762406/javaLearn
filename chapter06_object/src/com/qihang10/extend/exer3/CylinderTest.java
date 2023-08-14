package com.qihang10.extend.exer3;

/**
 * ClassName: CylinderTest
 * Package: com.qihang10.extend.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:56
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(2.3, 8.9 );
//        cy.setLength(2.3);
//        cy.setRadius(8.9);
        System.out.println(cy.findVolume());
        System.out.println(cy.findArea());
    }
}

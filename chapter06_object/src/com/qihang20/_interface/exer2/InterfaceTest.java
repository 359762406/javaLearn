package com.qihang20._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.qihang20._interface.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:25
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.2);
        ComparableCircle c2 = new ComparableCircle(5.6);
//        System.out.println(c1.compareTo(c2) > 0 ? "c1 < c2" : "c2 > c1");
        int compareKey = c1.compareTo(c2);
        switch (compareKey) {
            case 1 -> System.out.println("c1 < c2");
            case 0 -> System.out.println("c1 = c2");
            case -1 -> System.out.println("c1 > c2");
        }
        ComparableRectangle r1 = new ComparableRectangle(5.6,8.9);
        ComparableRectangle r2 = new ComparableRectangle(5.6,8.9);
        compareKey = r1.compareTo(r2);
        switch (compareKey) {
            case 1 -> System.out.println("c1 < c2");
            case 0 -> System.out.println("c1 = c2");
            case -1 -> System.out.println("c1 > c2");
        }
    }
}

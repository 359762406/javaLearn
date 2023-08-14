package com.qihang14.object.euqals.exer3;

/**
 * ClassName: OrderTest
 * Package: com.qihang14.object.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:45
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "orderAA11");
        Order order2 = new Order(1001, "orderAA11");
        System.out.println(order2.equals(order1));
        Order order3 = new Order(1001, new String("orderAA11"));
        Order order4 = new Order(1001, new String("orderAA11"));
        System.out.println(order2.equals(order1));
    }
}

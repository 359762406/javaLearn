package com.qihang14.object.euqals.exer3;

import java.util.Objects;

/**
 * ClassName: Order
 * Package: com.qihang14.object.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:39
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Order){
            Order o1 = (Order)obj;
            return ((Order) obj).getOrderId() == this.getOrderId() &&
                    Objects.equals(((Order) obj).getOrderName(), this.getOrderName());
        }
        return false;
    }
}

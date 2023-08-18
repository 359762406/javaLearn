package com.qihang02.selfdefine.apply;

import java.sql.Date;
import java.util.Objects;

/**
 * ClassName: Order
 * Package: com.qihang02.selfdefine.apply
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 14:56
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private int orderName;
    private Date orderDate;

    public Order() {
    }

    public Order(int orderId, int orderName, Date orderDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderName() {
        return orderName;
    }

    public void setOrderName(int orderName) {
        this.orderName = orderName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && orderName == order.orderName && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName, orderDate);
    }
}

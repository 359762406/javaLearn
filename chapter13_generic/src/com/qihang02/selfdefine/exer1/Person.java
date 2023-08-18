package com.qihang02.selfdefine.exer1;

/**
 * ClassName: Person
 * Package: com.qihang02.selfdefine
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:59
 * @Version 1.0
 */
public class Person<E>{
    /*
    * 自定义泛型类\接口
    * class A<T>{
    * }
    * interface B<T1, T2>{
    * }
    * */
    //声明了类的泛型参数以后，就可以在类的内部使用此泛型参数。
    private E e;
    private int orderId;

    public Person() {
    }

    public Person(E e, int orderId) {
        this.e = e;
        this.orderId = orderId;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "e=" + e +
                ", orderId=" + orderId +
                '}';
    }
}

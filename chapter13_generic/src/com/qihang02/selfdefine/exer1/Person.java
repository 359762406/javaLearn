package com.qihang02.selfdefine.exer1;

import java.util.ArrayList;

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
//    static E e1;
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

    public <T> T method(T t){ //在形参列表会出现泛型参数T
        return null;
    }
    /*
    *[访问权限]  <泛型>  返回值类型  方法名([泛型标识 参数名称])  [抛出的异常]{
        }
    *
    * */
    //定义一个泛型方法，将E[]放到ArrayList中
    public <E> ArrayList<E> copyFromArrayToList(E[] arr){
        ArrayList<E> aimArrayList = new ArrayList<>();
        for (E e : arr){
            aimArrayList.add(e);
        }
        return aimArrayList;
    }
    /*
    方法，也可以被泛型化，与其所在的类是否是泛型类没有关系。
    泛型方法中的泛型参数在方法被调用时确定。
    泛型方法可以根据需要，声明为static的。
    * */
    public static <E> ArrayList<E> copyFromArrayToListStatic(E[] arr){
        ArrayList<E> aimArrayList = new ArrayList<>();
        for (E e : arr){
            aimArrayList.add(e);
        }
        return aimArrayList;
    }
    @Override
    public String toString() {
        return "Person{" +
                "e=" + e +
                ", orderId=" + orderId +
                '}';
    }
}

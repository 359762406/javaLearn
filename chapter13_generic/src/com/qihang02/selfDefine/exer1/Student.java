package com.qihang02.selfDefine.exer1;

/**
 * ClassName: Student
 * Package: com.qihang02.selfdefine.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 22:34
 * @Version 1.0
 */
public class Student<T,V> extends Person<T>{
    private V v;

    public Student() {
    }

    public Student(V v) {
        this.v = v;
    }

    public Student(T t, int orderId, V v) {
        super(t, orderId);
        this.v = v;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

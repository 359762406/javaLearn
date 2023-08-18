package com.qihang02.selfDefine.exer1;

/**
 * ClassName: Structurer
 * Package: com.qihang02.selfdefine.exer1
 * Description:
 *      Architect是泛型类
 * @Author 刘起航
 * @Create 2023/8/17 22:30
 * @Version 1.0
 */
public class Architect<T> extends Person<String>{
    private T t;

    public Architect() {
    }

    public Architect(T t) {
        this.t = t;
    }

    public Architect(String s, int orderId, T t) {
        super(s, orderId);
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

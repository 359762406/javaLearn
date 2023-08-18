package com.qihang02.selfdefine.exer1;

/**
 * ClassName: Engineer
 * Package: com.qihang02.selfdefine.exer1
 * Description:
 *  Engineer 是泛型类
 * @Author 刘起航
 * @Create 2023/8/17 22:27
 * @Version 1.0
 */
public class Engineer<T> extends Person<T>{
    public void show(T t){
        System.out.println(t);
    }
}

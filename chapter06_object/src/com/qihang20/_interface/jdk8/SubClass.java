package com.qihang20._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.qihang20._interface.jdk8
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 16:51
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA, CompareB{
    @Override
    public void method2() {
        System.out.println("SubClass:上海");
    }
    public void method3(){
        System.out.println("SubClass：深圳");
    }
    public void method(){
        //如何在子类（或实现类）中调用父类或接口中被重写的方法
        this.method4(); // 调用自己类的方法
        super.method4(); // 父类的方法
        this.method3(); // 调用自己类的方法
        CompareA.super.method3(); // 调用接口CompareA中的默认方法  CompareA.super是一个实例方法
        CompareB.super.method3(); // 调用接口CompareB中的默认方法


    }
}

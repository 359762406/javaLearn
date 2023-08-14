package com.qihang21.inner;

/**
 * ClassName: ObjectTest
 * Package: com.qihang21.inner
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 21:09
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        //提供有一个继承于Object的匿名子类的匿名对象
        new Object(){ // 多态实现
            public void test(){
                System.out.println("123");
            }
        }.test();

    }

}

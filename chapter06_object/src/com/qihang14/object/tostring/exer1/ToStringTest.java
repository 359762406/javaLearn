package com.qihang14.object.tostring.exer1;

/**
 * ClassName: ToStringTest
 * Package: com.qihang14.object.tostring.exer1
 * Description:
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 *     >平时我们在调用System.out.println()打印对象引用变量时，其实就调用了对象的toString()
 * 使用说明：
 *     1.自定义的类，在没有重写0bject类的toString()的情况下，默认返回的是当前对象的地址值。
 *     2.像String、File、Date或包装类Object的子类，它们都重写了Object类的toString()，在调用toString()时，返回当前对象的实体内容。
 *习惯上，开发中对于自定义的类在调用toString()时，也希望显示其对象的实体内容，而非地址值。这时候，就需要重写Object类中的toString().
 *
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:55
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User(13,"Tom");
        System.out.println(u1.toString()); // com.qihang14.object.tostring.exer1.User@3b07d329
    }
}


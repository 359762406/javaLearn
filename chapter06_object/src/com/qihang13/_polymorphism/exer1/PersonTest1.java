package com.qihang13._polymorphism.exer1;

/**
 * ClassName: PersonTest1
 * Package: com.qihang13._polymorphism.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 16:31
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
//        p1.earnMoney();
//        System.out.println(p1.isSmoking);


        //向下转型
        Man m1 = (Man)p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);
        System.out.println(p1 == m1);  // p1 和 m1 在堆空间指向同一个对象，相同地址
        System.out.println(p1.equals(m1));
        /*
        向下转型可能会出现的问题:类型转化异常 ClassCastException
        * */
        Person p2 = new Woman();
//        Man m2 = (Man)p2;
//        System.out.println(m2.isSmoking);
        /*
        * 建议在向下转型之前，使用 instanceof进行判断，避免出现类型转化异常
        * 格式   a instanceof A  / superA 判断对象a是否为类A的实例
        *        保证程序正常运行，提高健壮性
        * */
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            System.out.println(m2.isSmoking);
        }
        if(p2 instanceof Woman){
            Woman m3 = (Woman)p2;
            m3.shopping();

        }
    }
}

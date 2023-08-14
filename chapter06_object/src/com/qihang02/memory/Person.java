package com.qihang02.memory;

/**
 * ClassName: Person
 * Package: com.qihang02.memory
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/14 10:46
 * @Version 1.0
 */
public class Person {
    //属性
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        System.out.println("在吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少保证每天" + hour + "小时的睡眠");

    }

}

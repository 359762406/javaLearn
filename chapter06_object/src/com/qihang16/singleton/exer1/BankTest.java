package com.qihang16.singleton.exer1;

/**
 * ClassName: BankTest
 * Package: com.qihang16.singleton.exer1
 * Description:单例模式  只有一个对象的实例
 *
 * @Author 刘起航
 * @Create 2023/7/20 17:03
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }

}

//饿汉式
class Bank{
    //1.类的构造器私有化
    private Bank(){

    }
    //2.在类的内部创建当前类的实例
    //4.该属性也需要被设计为Static
    private static Bank instance = new Bank();
    //3.使用get方法获取当前实例，必须声明为Static
    public static Bank getInstance() {
        return instance;
    }




}
package com.qihang18._final.exer1;

/**
 * ClassName: FinalTest
 * Package: com.qihang18._final.exer1
 * Description:
 * 1.final修饰类
 * 表示这个类不能被继承，没有子类。提高安全性，提高程序的可读性。
 * 例如：String类、System类、StringBuffer类
 * 2.final修饰方法
 * 表示这个方法不能被子类重写。
 * 例如：Object类中的getClass()
 * 3.final修饰变量
 * final修饰某个变量（成员变量或局部变量），一旦赋值，它的值就不能被修改，即常量，常量名建议使用大写字母。
 *  例如：final double MY_PI = 3.14;
 *  如果某个成员变量用final修饰后，没有set方法，并且必须初始化（可以显式赋值、或在初始化块赋值、实例变量还可以在构造器中赋值）
 * final修饰成员变量:有哪些位置可以给成员变量赋值?
 *  >显式赋值
 *  >代码块中赋值
 *  >构造器中赋值
 * final修饰局部变量:一旦赋值就不能修改
 *  >方法内声明的局部变量:在调用局部变量前，一定需要赋值。而且一旦赋值，就不可更改
 *  >方法的形参:在调用此方法时，给形参进行赋值。而且一旦赋值，就不可更改
 * @Author 刘起航
 * @Create 2023/7/21 10:57
 * @Version 1.0
 */
public class FinalTest {
}

final class A{

}
//class B extends A{   Cannot inherit from final 'com.qihang18._final.exer1.A'
//
//}

//class SubString extends String{
//
//}


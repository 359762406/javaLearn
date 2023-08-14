package com.qihang21.inner;

/**
 * ClassName: InnerTest
 * Package: com.qihang21.inner
 * Description:
 *       将一个类A定义在另一个类B里面，里面的那个类A就称为内部类（InnerClass），类B则称为外部类（OuterClass）
 * 为什么要声明内部类呢
 *      具体来说，当一个事物A的内部，还有一个部分需要一个完整的结构B进行描述，而这个内部的完整的结构B
 *      又只为外部事物A提供服务，不在其他地方单独使用，那么整个内部的完整结构B最好使用内部类。
 *      总的来说，遵循   高内聚、低耦合   的面向对象开发原则。
 *  举例：
 *  Thread类内部声明的State类，表示线程的生命周期
 *  HashMap类中声明了Node类,表示封装的key和value
 * @Author 刘起航
 * @Create 2023/7/22 17:10
 * @Version 1.0
 */
public class InnerTest {

}

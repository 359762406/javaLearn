package com.qihang20._interface.exer1;

/**
 * ClassName: InterfaceTest
 * Package: com.qihang20._interface.exer1
 * Description:
 *  接口的本质是契约、标准、规范，就像我们的法律一样。制定好后大家都要遵守。
 *  引用数据类型：数组，类，枚举，接口，注解。
 *
 *  接口内部结构的说明:
 *      >可以声明:
 *          属性:必须使用public static final修饰
 *          方法:jdk8之前:声明抽象方法，修饰为public abstract
 *              jdk8:声明静态方法、默认方法
 *              jdk9:声明私有方法
 *      >不可以声明：构造器，代码块
 *接口和类的关系为实现关系
 *class A extends superA implements B,C{}
 *      A相较于SuperA来讲，叫做子类
 *      A相较于B,C来讲，叫做实现类。
 *
 * 6．满足此关系之后，说明:
 *  >类可以实现多个接口。
 *  >类针对于接口的多实现，一定程度上就弥补了类的单继承的局限性。
 *  >类必须将实现的接口中的所有的抽象方法都重写（或穿现)，方可实例化。否则，此实现类必须声明为抽象类。
 *
 *  接口与接口的关系:继承关系，且可以多继承
 *  接口的多态性: 接口名  变量名  = new  实现类对象;
 *
 *  9．面试题:区分抽象类和接口
 *  >共性:都可以声明抽象方法
 *      都不能实例化
 *  >不同:1.抽象类一定有构造器。接口没有构造器
 *       2.类与类之间继承关系，类与接口之间是实现关系，接口与接口之间是多继承关系
 * @Author 刘起航
 * @Create 2023/7/22 10:15
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);

        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();
        //接口的多态性
        Flyable F1  = new Bullet();
        F1.fly();
    }
}
interface Flyable{  // 接口
    //全局变量
    public static final int MIN_SPEED = 0;

    //可以省略 public static final
    int MAX_SPEED = 7900;

    //方法 可以省略public abstract声明
    public abstract void fly();

}
interface Aggressive{
    void attack();
}
abstract class Plane implements Flyable{


}

class Bullet implements Flyable, Aggressive{

    @Override
    public void fly() {
        System.out.println("子弹可以飞行");
    }

    @Override
    public void attack() {
        System.out.println("子弹攻击");
    }
}

//测试接口的继承关系
interface AA{
    void method1();
}
interface BB{
    void method2();
}

interface CC extends AA, BB{ // 接口可以多继承

}

class DD implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
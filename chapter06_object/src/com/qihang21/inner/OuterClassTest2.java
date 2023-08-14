package com.qihang21.inner;

/**
 * ClassName: OuterClassTest2
 * Package: com.qihang21.inner
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 21:16
 * @Version 1.0
 */
public class OuterClassTest2 {
    public static void main(String[] args) {
        //way1
        SubA a = new SubA();
        a.method();

        //way2:提供接口匿名实现类的对象
        A a1 = new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类重写的方法");
            }
        };
        a1.method();
        //way3：提供接口匿名实现类的匿名对象
        new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类重写的method()方法");
            }
        }.method();

        //way4
        SubB s1 = new SubB();
        s1.method1();
        //way5 提供了继承于抽象类的匿名子类的对象
        B b = new B() {
            @Override
            public void method1() {
                System.out.println("继承于抽象类的子类调用的方法");
            }
        };
        b.method1();
        //way6
        new B() {
            @Override
            public void method1() {
                System.out.println("继承于抽象类的子类调用的方法");
            }
        }.method1();

        //way7 提供了一个继承于C的匿名子类的对象 多态
        C c = new C(){};
        c.method2();
        System.out.println(c.getClass());
        System.out.println(c.getClass().getSuperclass());

        C c1 = new C(){
            public void method2(){
                System.out.println("SubC");
            }
        };
        c1.method2();
    }

}
interface A{
    public void method();
}
class SubA implements A{

    @Override
    public void method() {
        System.out.println("类重写的方法");

    }
}
abstract class B{
    public abstract void method1();
}
class SubB extends B{

    @Override
    public void method1() {
        System.out.println("类重写的抽象方法");

    }
}
class C{
    public void method2(){
        System.out.println("C");
    }
}


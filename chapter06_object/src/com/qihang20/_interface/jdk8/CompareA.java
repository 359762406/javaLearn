package com.qihang20._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.qihang20._interface.jdk8
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 16:49
 * @Version 1.0
 */
public interface CompareA {
    //属性：声明为public static final
    //方法：jdk8之前，只能声明抽象方法

    //方法：jdk8中，静态方法
    public static void method1(){
        System.out.println("Compare：北京");
    }
    //方法：jdk8中，默认方法
    public default void method2(){
        System.out.println("Compare：上海");
    }
    public default void method3(){
        System.out.println("Compare：深圳");
    }
    public default void method4(){
        System.out.println("Compare：广州");
    }
    //jdk9新特性:定义私有方法
    private void method5(){
        System.out.println("接口中定义的私有方法");
    }
}

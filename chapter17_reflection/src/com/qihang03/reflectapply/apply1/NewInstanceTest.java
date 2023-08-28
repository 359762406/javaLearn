package com.qihang03.reflectapply.apply1;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * ClassName: NewInstanceTest
 * Package: com.qihang03.reflectapply.apply1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 22:19
 * @Version 1.0
 */
public class NewInstanceTest {
    /*
    *
1.（掌握)反射的应用1:创建运行时类的对象
1.1 如何实现?
通过Class的实例调用newInstance()方法即可。
1.2要想创建对象成功，需要满足:
条件1:要求运行时类中必须提供一个空参的构造器
条件2:要求提供的空参的构造器的权限要足够。
1.3回忆:JavaBean中要求给当前类提供一个公共的空参的构造器。有什么用?
* >场景1。子类对象在实例化时，子类的构造器的首行默认调用父类空参的构造器。
场景2。在反射中，经常用来创建运行时类的对象。那么我们要求各个运行时类都提供一个空参的构造器，便于我们编写
创建运行时类对象的代码。
1.4
* 在jdk9中标识为过时，替换成什么结构通过Constructor类调用newInstance( . . .)

    * */
    /*
    *
 应用1：创建运行时类的对象
这是反射机制应用最多的地方。创建运行时类的对象有两种方式：
方式1：直接调用Class对象的newInstance()方法
    要求： 1）类必须有一个无参数的构造器。2）类的构造器的访问权限需要足够。
方式2：通过获取构造器对象来进行实例化
方式一的步骤：
1）获取该类型的Class对象 2）调用Class对象的newInstance()方法创建对象
方式二的步骤：
1）通过Class类的getDeclaredConstructor(Class … parameterTypes)取得本类的指定形参类型的构造器
2）向构造器的形参中传递一个对象数组进去，里面包含了构造器中所需的各个参数。
3）通过Constructor实例化对象。
如果构造器的权限修饰符修饰的范围不可见，也可以调用setAccessible(true)
    * */
    @Test
    public void test1() throws Exception{
//        AtGuiguClass obj = new AtGuiguClass();//编译期间无法创建

        Class<?> clazz = Class.forName("com.qihang03.reflectapply.apply2.Person");
        //clazz代表com.atguigu.ext.demo.AtGuiguClass类型
        //clazz.newInstance()创建的就是AtGuiguClass的对象
        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

    @Test
    public void test2()throws Exception{
        Class<?> clazz = Class.forName("com.qihang03.reflectapply.apply2.Person");
        //java.lang.InstantiationException: com.atguigu.ext.demo.AtGuiguDemo
        //Caused by: java.lang.NoSuchMethodException: com.atguigu.ext.demo.AtGuiguDemo.<init>()
        //即说明AtGuiguDemo没有无参构造，就没有无参实例初始化方法<init>
        Object stu = clazz.newInstance();
        System.out.println(stu);
    }

    @Test
    public void test3()throws Exception{
        //(1)获取Class对象
        Class<?> clazz = Class.forName("com.qihang03.reflectapply.apply2.Person");
        /*
         * 获取AtGuiguDemo类型中的有参构造
         * 如果构造器有多个，我们通常是根据形参【类型】列表来获取指定的一个构造器的
         * 例如：public AtGuiguDemo(String title, int num)
         */
        //(2)获取构造器对象
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,int.class);

        //(3)创建实例对象
        // T newInstance(Object... initargs)  这个Object...是在创建对象时，给有参构造的实参列表
        constructor.setAccessible(true);
        Object obj = constructor.newInstance("尚硅谷",2022);
        System.out.println(obj);
    }
}

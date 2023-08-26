package com.qihang01.example;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ShortBuffer;

/**
 * ClassName: ReflectionTest
 * Package: com.qihang01.example
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 15:47
 * @Version 1.0
 */
public class ReflectionTest {
    @Test
    public void test1(){
        /*
1．面向对象中创建对象，调用指定结构（属性、方法)等功能，可以不使用反射，也可以使用反射。请问有什么区别?
    不使用反射，我们需要考虑封装性。比如:出了Person类之后，就不能调用Person类中私有的结构
    使用反射，我们可以调用运行时类中任意的构造器、属性、方法。包括了私有的属性、方法、构造器。
2．以前创建对象并调用方法的方式，与现在通过反射创建对象并调用方法的方式对比的话，哪种用的多?场景是什么?
    从我们作为程序员开发者的角度来讲，我们开发中主要是完成业务代码，对于相关的对象、方法的调用都是确定的。所以，我们使用非反射的方式多一些。
    因为反射体现了动态性（可以在运行时动态的获取对象所属的类，动态的调用相关的方法)，所以我们在设计框架的时候，会大量的使用反射。
    框架 = 注解 + 反射 + 设计模式
3．单例模式的饿汉式和懒汉式中，私有化类的构造器了!妳此时通过反射，可以创建单例模式中类的多个对象吗?
    是的!
4．通过反射，可以调用类中私有的结构，是否与面向对象的封装性有冲突?是不是Java语言设计存在Bug?
    不存在bug!
    封装性:体现的是是否建议我们调用内部api的问题。比如，private声明的结构，意味着不建议调用
    反射:体现的是我们能否调用的问题。因为类的完整结构都加载到了内存中，所有我们就有能力进行调用。


        * */
        //获取Class类的实例
        Class<Person> _class = Person.class;
        try {
            //获取对象的有参构造
            Constructor<Person> constructor = _class.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            Person person = (Person)constructor.newInstance("tom", 12);
            System.out.println(person);

            //调用私有属性  --->暴力反射
            Field name = _class.getDeclaredField("name");
            name.setAccessible(true); // 获取权限
            name.set(person, "Jerry");
            System.out.println(person);
            //调用public属性
            Field age = _class.getDeclaredField("age");
            age.set(person, 34);
            System.out.println(person);
            //调用私有方法
            Method showNationMethod = _class.getDeclaredMethod("showNation",String.class);
            showNationMethod.setAccessible(true);
            String showNation = (String) showNationMethod.invoke(person, "china");
            System.out.println(showNation);

        } catch (NoSuchMethodException | InstantiationException | NoSuchFieldException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}

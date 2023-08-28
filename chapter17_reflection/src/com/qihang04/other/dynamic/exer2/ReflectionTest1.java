package com.qihang04.other.dynamic.exer2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest1
 * Package: com.qihang04.other.dynamic.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 15:47
 * @Version 1.0
 */
public class ReflectionTest1 {
    //静态
    public Person getInstance(){
        return new Person();
    }
    //体会反射的动态性：动态的创建给定字符串对应的类的对象
    public <T> T getInstance(String className) throws Exception {

        Class<?> clazz = Class.forName(className);

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();

    }

    @Test
    public void test1() throws Exception {
        String className = "com.qihang04.other.dynamic.exer2.Person";
        Person p1 = getInstance(className);
        System.out.println(p1);
    }
    //体会反射的动态性：动态的创建指定字符串对应类的对象，并调用指定的方法
    public Object  invoke(String className,String methodName) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        //动态的创建指定字符串对应类的对象
        Object obj = constructor.newInstance();

        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(obj);
    }
    public Object  invoke(String className,String methodName, String parameter, int number, String stringParameter) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        //动态的创建指定字符串对应类的对象
        Object obj = constructor.newInstance(stringParameter, number);

        Method method = clazz.getDeclaredMethod(methodName, String.class);
        method.setAccessible(true);
        return method.invoke(obj, parameter);
    }
    @Test
    public void test2() throws Exception {
        String info = (String) invoke("com.qihang04.other.dynamic.exer2.Person", "showNation", "china", 18, "tom");

        System.out.println("返回值为：" + info);

    }
}

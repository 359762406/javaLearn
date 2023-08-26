package com.qihang02._class;

import org.junit.Test;

import java.io.*;
import java.nio.ShortBuffer;
import java.util.Properties;

/**
 * ClassName: ClassLoaderTest
 * Package: com.qihang02._class
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 20:56
 * @Version 1.0
 */
public class ClassLoaderTest {
    @Test
    public void test01(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
    }

    @Test
    public void test02()throws Exception{
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println("加载String类的类加载器：" + c1);

        ClassLoader c2 = Class.forName("sun.util.resources.cldr.zh.TimeZoneNames_zh").getClassLoader();
        System.out.println("加载sun.util.resources.cldr.zh.TimeZoneNames_zh类的类加载器：" + c2);

        ClassLoader c3 = ClassLoaderTest.class.getClassLoader();
        System.out.println("加载当前类的类加载器：" + c3);
    }

    @Test
    public void test03(){
        ClassLoader c1 = ClassLoaderTest.class.getClassLoader();
        System.out.println("加载当前类的类加载器c1=" + c1);

        ClassLoader c2 = c1.getParent();
        System.out.println("c1.parent = " + c2);

        ClassLoader c3 = c2.getParent();
        System.out.println("c2.parent = " + c3);

    }
    @Test
    public void test4(){
        Class _class = Person.class;
        ClassLoader classLoader = _class.getClassLoader(); //jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        System.out.println(classLoader);
        ClassLoader c1 = String.class.getClassLoader(); // 引导类加载器
        System.out.println("加载String类的类加载器：" + c1);
    }

    /*
    * 双亲验证机制，保证lang包下的文件不会被篡改
    * */

    /**
     * 通过FileInputStream加载指定的配置文件
     */
    @Test
    public void test5(){
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(new File("info.properties"));
            properties.load(fileInputStream);
            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println(name  +"'s password is " + password + ".");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 通过ClassLoader加载指定的配置文件
     */
    @Test
    public void test6(){
        try {
            Properties properties = new Properties();
            //路径在module下
//            FileInputStream fileInputStream = new FileInputStream(new File("info.properties"));
//            properties.load(fileInputStream);
            //路径在src下
            InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");
            properties.load(resourceAsStream);
            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println(name  +"'s password is " + password + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}

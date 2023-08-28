package com.qihang03.reflectapply.exer;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName: reflectionTest
 * Package: com.qihang03.reflectapply.exer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 15:04
 * @Version 1.0
 */
public class reflectionTest {
    @Test
    public void test() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载配置文件，转换为一个集合
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("user.properties");
        properties.load(inputStream);
        //3.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //4.加载该类进内存
        Class<?> clazz = Class.forName(className);
        //3.获取配置文件中定义的数据
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        Object o = declaredConstructor.newInstance("tom");
        //6.获取方法对象
        Method declaredMethod = clazz.getDeclaredMethod(methodName);
        //7.执行方法
        System.out.println(declaredMethod.invoke(o));

    }

}

package com.qihang04.other.dynamic.exer1;

import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * ClassName: Reflection
 * Package: com.qihang03.reflectapply.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 15:39
 * @Version 1.0
 */
public class ReflectionTest {
    @Test
    public void test1() throws Exception {
        //1.加载配置文件，并获取指定的fruitName值
        Properties pros = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
        pros.load(is);
        String fruitStr = pros.getProperty("fruitName");
        //2.创建指定全类名对应类的实例
        Class<?> clazz = Class.forName(fruitStr);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Fruit fruit = (Fruit) constructor.newInstance();
        //3. 调用相关方法，进行测试 反射+多态
        Juicer juicer = new Juicer();
        juicer.run(fruit);

    }

}

interface Fruit {
    public void squeeze();
}

class Apple implements Fruit {

    @Override
    public void squeeze() {
        System.out.println("榨出一杯苹果汁儿");
    }
}

class Orange implements Fruit {
    @Override
    public void squeeze() {
        System.out.println("榨出一杯桔子汁儿");
    }
}

class Juicer {
    public void run(Fruit f) {
        f.squeeze();
    }
}


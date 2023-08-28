package com.qihang03.reflectapply.apply3;

import com.qihang03.reflectapply.apply2.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Package: com.qihang03.reflectapply.apply3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 10:28
 * @Version 1.0
 */
public class ReflectionTest {
    /*
调用指定的属性
在反射机制中，可以直接通过Field类操作类中的属性，通过Field类提供的set()和get()方法就可以完成设置和取得属性内容的操作。
（1）获取该类型的Class对象
    Class clazz = Class.forName("包.类名");
（2）获取属性对象
    Field field = clazz.getDeclaredField("属性名");
（3）如果属性的权限修饰符不是public，那么需要设置属性可访问
    field.setAccessible(true);
（4）创建实例对象：如果操作的是非静态属性，需要创建实例对象
    Object obj = clazz.newInstance(); //有公共的无参构造
    Object obj = 构造器对象.newInstance(实参...);//通过特定构造器对象创建实例对象
（4）设置指定对象obj上此Field的属性内容
    field.set(obj,"属性值");
    如果操作静态变量，那么实例对象可以省略，用null表示
（5）取得指定对象obj上此Field的属性内容
    Object value = field.get(obj);
    如果操作静态变量，那么实例对象可以省略，用null表示
    *
    * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //1、获取Student的Class对象
        Class clazz = Class.forName("com.qihang03.reflectapply.apply3.Student");

        //2、获取属性对象，例如：id属性
        Field idField = clazz.getDeclaredField("id");
        Field InfoField = clazz.getDeclaredField("info");
        InfoField.setAccessible(true);
        /*
关于setAccessible方法的使用：
    Method和Field、Constructor对象都有setAccessible()方法。
    setAccessible启动和禁用访问安全检查的开关。
    参数值为true则指示反射的对象在使用时应该取消Java语言访问检查。
        提高反射的效率。如果代码中必须用反射，而该句代码需要频繁的被调用，那么请设置为true。
        使得原本无法访问的私有成员也可以访问
    参数值为false则指示反射的对象应该实施Java语言访问检查
        * */
        InfoField.set(Student.class, "student");
        System.out.println(InfoField.get(null));
        //3、如果id是私有的等在当前类中不可访问access的，我们需要做如下操作
        idField.setAccessible(true);

        //4、创建实例对象，即，创建Student对象
        Object stu = clazz.newInstance();

        //5、获取属性值
        /*
         * 以前：int 变量= 学生对象.getId()
         * 现在：Object id属性对象.get(学生对象)
         */
        Object value = idField.get(stu);
        System.out.println("id = "+ value);

        //6、设置属性值
        /*
         * 以前：学生对象.setId(值)
         * 现在：id属性对象.set(学生对象,值)
         */

        idField.set(stu, 2);

        value = idField.get(stu);
        System.out.println("id = "+ value);
    }
    /*
    * 调用指定的方法
    * */
    /*
    *（1）获取该类型的Class对象

Class clazz = Class.forName("包.类名");

（2）获取方法对象

Method method = clazz.getDeclaredMethod("方法名",方法的形参类型列表);

（3）创建实例对象

Object obj = clazz.newInstance();

（4）调用方法

Object result = method.invoke(obj, 方法的实参值列表);

如果方法的权限修饰符修饰的范围不可见，也可以调用setAccessible(true)

如果方法是静态方法，实例对象也可以省略，用null代替
    *
    * */
    @Test
    public void test() throws Exception {
        // 1、获取Student的Class对象
        Class<?> clazz = Class.forName("com.qihang03.reflectapply.apply3.Student");

        //2、获取方法对象
        /*
         * 在一个类中，唯一定位到一个方法，需要：（1）方法名（2）形参列表，因为方法可能重载
         *
         * 例如：void setName(String name)
         */
        Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);

        //3、创建实例对象
        Object stu = clazz.newInstance();

        //4、调用方法
        /*
         * 以前：学生对象.setName(值)
         * 现在：方法对象.invoke(学生对象，值)
         */
        Object setNameMethodReturnValue = setNameMethod.invoke(stu, "张三");

        System.out.println("stu = " + stu);
        //setName方法返回值类型void，没有返回值，所以setNameMethodReturnValue为null
        System.out.println("setNameMethodReturnValue = " + setNameMethodReturnValue);

        Method getNameMethod = clazz.getDeclaredMethod("getName");
        Object getNameMethodReturnValue = getNameMethod.invoke(stu);
        //getName方法返回值类型String，有返回值，getNameMethod.invoke的返回值就是getName方法的返回值
        System.out.println("getNameMethodReturnValue = " + getNameMethodReturnValue);//张三
    }

    @Test
    public void test2() throws Exception{
        Class<?> clazz = Class.forName("com.atguigu.ext.demo.AtGuiguClass");
        Method printInfoMethod = clazz.getMethod("printInfo", String.class);
        //printInfo方法是静态方法
        printInfoMethod.invoke(null,"尚硅谷");
    }
    @Test
    public void test3()
            throws InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException,
            ClassNotFoundException {
        Class<?> clazz = Class.forName("com.qihang03.reflectapply.apply3.Student");
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, String.class);
        constructor.setAccessible(true);
        Student stu = (Student) constructor.newInstance(12, "tom");
        Method showNation = clazz.getDeclaredMethod("showNation", String.class, int.class);
        showNation.setAccessible(true);
        Object o = showNation.invoke(stu, "china", 123);
        System.out.println(o.toString());
    }

}

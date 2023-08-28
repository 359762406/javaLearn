package com.qihang03.reflectapply.apply2;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * ClassName: ReflectionApplyTest
 * Package: com.qihang03.reflectapply.apply2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 22:23
 * @Version 1.0
 */
public class ReflectionApplyTest {
    /*
    *
2反射应用
2:获取运行时类的内部结构
2.1 (了解）获取运行时类的内部结构1:所有属性、所有方法、所有构造器
2.2（熟悉）获取运行时类的内部结构2:父类、接口们、包、带泛型的父类、父类的泛型等
    * */
    /*
//1.实现的全部接口
public Class<?>[] getInterfaces()
//确定此对象所表示的类或接口实现的接口。

//2.所继承的父类
public Class<? Super T> getSuperclass()
//返回表示此 Class 所表示的实体（类、接口、基本类型）的父类的 Class。

//3.全部的构造器
public Constructor<T>[] getConstructors()
//返回此 Class 对象所表示的类的所有public构造方法。
public Constructor<T>[] getDeclaredConstructors()
//返回此 Class 对象表示的类声明的所有构造方法。

//Constructor类中：
//取得修饰符:
public int getModifiers();
//取得方法名称:
public String getName();
//取得参数的类型：
public Class<?>[] getParameterTypes();

//4.全部的方法
public Method[] getDeclaredMethods()
//返回此Class对象所表示的类或接口的全部方法
public Method[] getMethods()
//返回此Class对象所表示的类或接口的public的方法

//Method类中：
public Class<?> getReturnType()
//取得全部的返回值
public Class<?>[] getParameterTypes()
//取得全部的参数
public int getModifiers()
//取得修饰符
public Class<?>[] getExceptionTypes()
//取得异常信息

//5.全部的Field
public Field[] getFields()
//返回此Class对象所表示的类或接口的public的Field。
public Field[] getDeclaredFields()
//返回此Class对象所表示的类或接口的全部Field。

//Field方法中：
public int getModifiers()
//以整数形式返回此Field的修饰符
public Class<?> getType()
//得到Field的属性类型
public String getName()
//返回Field的名称。

//6. Annotation相关
get Annotation(Class<T> annotationClass)
getDeclaredAnnotations()

//7.泛型相关
//获取父类泛型类型：
Type getGenericSuperclass()
//泛型类型：ParameterizedType
//获取实际的泛型类型参数数组：
getActualTypeArguments()

//8.类所在的包
Package getPackage()
    * */
    @Test
    public void test1(){

        Class clazz = Person.class;
        //getFields():获取到运行时类本身及其所有的父类中声明为public权限的属性
//		Field[] fields = clazz.getFields();
//
//		for(Field f : fields){
//			System.out.println(f);
//		}

        //getDeclaredFields():获取当前运行时类中声明的所有属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    //权限修饰符  变量类型  变量名
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            /*
             * 0x是十六进制
             * PUBLIC           = 0x00000001;  1    1
             * PRIVATE          = 0x00000002;  2	10
             * PROTECTED        = 0x00000004;  4	100
             * STATIC           = 0x00000008;  8	1000
             * FINAL            = 0x00000010;  16	10000
             * ...
             *
             * 设计的理念，就是用二进制的某一位是1，来代表一种修饰符，整个二进制中只有一位是1，其余都是0
             *
             * mod = 17          0x00000011
             * if ((mod & PUBLIC) != 0)  说明修饰符中有public
             * if ((mod & FINAL) != 0)   说明修饰符中有final
             */
            int modifier = f.getModifiers();
            System.out.print(modifier + ":" + Modifier.toString(modifier) + "\t");

//            //2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");
//
//            //3.变量名
            String fName = f.getName();
            System.out.print(fName);
//
            System.out.println();
        }
    }
    @Test
    public void test3() {

        Class clazz = Person.class;
        // getMethods():获取到运行时类本身及其所有的父类中声明为public权限的方法
         Method[] methods = clazz.getMethods();

         for(Method m : methods){
         System.out.println(m);
         }

        // getDeclaredMethods():获取当前运行时类中声明的所有方法
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m);
//        }
        //
    }

    // 注解信息
    // 权限修饰符 返回值类型 方法名(形参类型1 参数1,形参类型2 参数2,...) throws 异常类型1,...{}
    @Test
    public void test4() {
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            // 1.获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }

            // 2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            // 3.返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            // 4.方法名
            System.out.print(m.getName());
            System.out.print("(");
            // 5.形参列表
            Class[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {

                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                        break;
                    }

                    System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                }
            }

            System.out.print(")");

            // 6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }
            System.out.println();
        }
    }
    /*
    	获取当前类中的所有的构造器
     */
    @Test
    public void test5(){
        Class clazz = Person.class;
        Constructor[] cons = clazz.getDeclaredConstructors();
        for(Constructor c :cons){
            System.out.println(c);
        }
    }
    /*
    	获取运行时类的父类
     */
    @Test
    public void test6(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);//class com.atguigu.java1.Creature
    }
    /*
    	获取运行时类的所在的包
     */
    @Test
    public void test7(){
        Class clazz = Person.class;
        Package pack = clazz.getPackage();
        System.out.println(pack);

    }
    /*
    	获取运行时类的注解
     */
    @Test
    public void test8(){
        Class clazz = Person.class;
        Annotation[] annos = clazz.getAnnotations();
        for (Annotation anno : annos) {

            System.out.println(anno);
        }

    }

    /*
    	获取运行时类所实现的接口
     */
    @Test
    public void test9(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {

            System.out.println(anInterface);
        }

    }
    /*
    	获取运行时类的带泛型的父类
     */
    @Test
    public void test10(){
        Class clazz = Son.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);//com.atguigu.java1.Creature<java.lang.String>

        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        for (Type a : actualTypeArguments){
            System.out.println(((Class<?>)a).getName());
        }
    }
    /*
    * 获取运行时类的带泛型的父类
    * */
    @Test
    public void test11() throws ClassNotFoundException {
        Class _class = Class.forName("com.qihang03.reflectapply.apply2.Person");
        Package aPackage = _class.getPackage();
        System.out.println(aPackage);


    }

}

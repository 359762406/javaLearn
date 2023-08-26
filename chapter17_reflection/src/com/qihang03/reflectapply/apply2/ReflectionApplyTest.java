package com.qihang03.reflectapply.apply2;

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
}

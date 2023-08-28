package com.qihang04.other.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * ClassName: AnnotationTest
 * Package: com.qihang04.other.AnnotationTest
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 12:00
 * @Version 1.0
 */
public class AnnotationTest {
    /*
一个完整的注解应该包含三个部分：
（1）声明
（2）使用
（3）读取
    * */
    /*声明自定义注解
自定义注解可以通过四个元注解@Retention, @Target, @Inherited, @Documented，
分别说明它的声明周期，使用位置，是否被继承，是否被生成到API文档中。
Annotation的成员在Annotation定义中以无参数有返回值的抽象方法的形式来声明，我们又称为配置参数。
    返回值类型只能是八种基本数据类型、String类型、Class类型、enum类型、Annotation类型、以上所有类型的数组
可以使用 default 关键字为抽象方法指定默认返回值
如果定义的注解含有抽象方法，那么使用时必须指定返回值，除非它有默认值。格式是“方法名 = 返回值”，如果只有一个抽象方法需要赋值，
    且方法名为value，可以省略“value=”，所以如果注解只有一个抽象方法成员，建议使用方法名value。
    * */
    //获取类的声明上的注解
    @Test
    public void testAnnotation(){
        Class<Customer> clazz = Customer.class;
        Table declaredAnnotation = clazz.getDeclaredAnnotation(Table.class);
        System.out.println(declaredAnnotation.value());
    }
    //获取属性声明的注解
    @Test
    public void test2() throws NoSuchFieldException {
        Class<Customer> clazz = Customer.class;
        Field declaredField = clazz.getDeclaredField("name");
        Column declaredAnnotation = declaredField.getDeclaredAnnotation(Column.class);
        //获取属性声明的注解
        System.out.println(declaredAnnotation.columnName() + "\n"
                + declaredAnnotation.columnType());
    }
    
}

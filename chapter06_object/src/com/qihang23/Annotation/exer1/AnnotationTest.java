package com.qihang23.Annotation.exer1;

/**
 * ClassName: AnnotationTest
 * Package: com.qihang23.Annotation.exer1
 * Description:
 *元注解
 * JDK1.5在java.lang.annotation包定义了4个标准的meta-annotation类型，它们被用来提供对其它 annotation类型作说明。
 *
 * （1）**@Target：**用于描述注解的使用范围
 *
 * 可以通过枚举类型ElementType的10个常量对象来指定
 * TYPE，METHOD，CONSTRUCTOR，PACKAGE.....
 * （2）**@Retention：**用于描述注解的生命周期
 *
 * 可以通过枚举类型RetentionPolicy的3个常量对象来指定
 * SOURCE（源代码）、CLASS（字节码）、RUNTIME（运行时）
 * 唯有RUNTIME阶段才能被反射读取到。
 * （3）@Documented：表明这个注解应该被 javadoc工具记录。
 *
 * （4）**@Inherited：**允许子类继承父类中的注解
 * @Author 刘起航
 * @Create 2023/7/24 11:47
 * @Version 1.0
 */
public class AnnotationTest {
}
@MyAnnotation(value = "class")
class Person{
    String name;
    int age;

    @MyAnnotation()
    public Person() {
    }
    @Deprecated
    public Person(String name){
        this.name = name;
    }
}

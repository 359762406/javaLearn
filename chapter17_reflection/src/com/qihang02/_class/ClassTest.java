package com.qihang02._class;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.util.Calendar;

/**
 * ClassName: ClassTest
 * Package: com.qihang02._class
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 17:08
 * @Version 1.0
 */
public class ClassTest {
    /*
1. Class类的理解（掌握)(如下以Java类的加载为例说明)
 针对于编写好的.java源文件进行编译(使用javac.exe)，会生成一个或多个.class字节码文件。
 接着，我们使用java.exe命令对指定的.class文件进行解释运行。
 这个解释运行的过程中，我们需要将.class字节码文件加载(使用类的加载器)到内存中。
 加载到内存(存放在方法区)中的.class文件对应的结构即为Class的一个实例。
 Person.class作为Class的实例

 说明:运行时类在内存中会缓存起来，在整个执行期间，只会加载一次。

 * */
    /*
    * 获取Class实例的几种方式
    * */
    @Test
    public void test1(){
        //1.调用运行时的静态属性
        Class<Person> _class  = Person.class;
        System.out.println(_class); //class com.qihang02._class.Person
        //2.调用运行时类的getClass()方法
        Person person = new Person();
        Class<? extends Person> _classPerson = person.getClass();
        System.out.println(_classPerson);
        System.out.println(_class == _classPerson);
        //3.Class的静态方法forName(String className) 动态性最好
        String className = "com.qihang02._class.Person";
        try {
            Class<?> aClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //类的加载器
        try {
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    * 哪些类型可以有Class对象
简言之，所有Java类型！
（1）class：外部类，成员(成员内部类，静态内部类)，局部内部类，匿名内部类
（2）interface：接口
（3）[]：数组
（4）enum：枚举
（5）annotation：注解@interface
（6）primitive type：基本数据类型
（7）void
    * */
    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
// 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
    /*
    *类的加载又分为三个阶段：
（1）装载（Loading）
    将类的class文件读入内存，并为之创建一个java.lang.Class对象。此过程由类加载器完成
（2）链接（Linking）
    ①验证Verify：确保加载的类信息符合JVM规范，例如：以cafebabe开头，没有安全方面的问题。
    ②准备Prepare：正式为类变量（static）分配内存并设置 类变量默认初始值 的阶段，这些内存都将在方法区中进行分配。
    ③解析Resolve：虚拟机常量池内的符号引用（常量名）替换为直接引用（地址）的过程。
（3）初始化（Initialization）
    执行类构造器<clinit>()方法的过程。类构造器<clinit>()方法是由编译期自动收集类中所有类变量的赋值动作和静态代码块中的语句合并产生的。
        （类构造器是构造类信息的，不是构造该类对象的构造器）。
    当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化。
    虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确加锁和同步。
    * */

    /*
    * 类加载器的作用:负责类的加载，并对应于一个Class的实例
将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，
*   然后在堆中生成一个代表这个类的java.lang.Class对象，作为方法区中类数据的访问入口。
类缓存：标准的JavaSE类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，
*   它将维持加载（缓存）一段时间。不过JVM垃圾回收机制可以回收这些Class对象。
    * */
    /*
    * 类加载器的分类(JDK8为例)
JVM支持两种类型的类加载器，分别为 引导类加载器 （Bootstrap ClassLoader）和 自定义类加载器 （User-Defined ClassLoader）。
从概念上来讲，自定义类加载器一般指的是程序中由开发人员自定义的一类类加载器，但是Java虚拟机规范却没有这么定义，
* 而是将所有派生于抽象类ClassLoader的类加载器都划分为自定义类加载器。无论类加载器的类型如何划分，
*   在程序中我们最常见的类加载器结构主要是如下情况：
（1）启动类加载器（引导类加载器，Bootstrap ClassLoader）
这个类加载使用C/C++语言实现的，嵌套在JVM内部。获取它的对象时往往返回null
它用来加载Java的核心库（JAVA_HOME/jre/lib/rt.jar或sun.boot.class.path路径下的内容）。用于提供JVM自身需要的类。
并不继承自java.lang.ClassLoader，没有父加载器。
出于安全考虑，Bootstrap启动类加载器只加载包名为java、javax、sun等开头的类
加载扩展类和应用程序类加载器，并指定为他们的父类加载器。
（2）扩展类加载器（Extension ClassLoader）
Java语言编写，由sun.misc.Launcher$ExtClassLoader实现。
继承于ClassLoader类
父类加载器为启动类加载器
从java.ext.dirs系统属性所指定的目录中加载类库，或从JDK的安装目录的jre/lib/ext子目录下加载类库。
*   如果用户创建的JAR放在此目录下，也会自动由扩展类加载器加载。
（3）应用程序类加载器（系统类加载器，AppClassLoader）
java语言编写，由sun.misc.Launcher$AppClassLoader实现
继承于ClassLoader类
父类加载器为扩展类加载器
它负责加载环境变量classpath或系统属性 java.class.path 指定路径下的类库
应用程序中的类加载器默认是系统类加载器。
它是用户自定义类加载器的默认父加载器
通过ClassLoader的getSystemClassLoader()方法可以获取到该类加载器
（4）用户自定义类加载器（了解）
在Java的日常应用程序开发中，类的加载几乎是由上述3种类加载器相互配合执行的。在必要时，我们还可以自定义类加载器，来定制类的加载方式。
体现Java语言强大生命力和巨大魅力的关键因素之一便是，Java开发者可以自定义类加载器来实现类库的动态加载，
*   加载源可以是本地的JAR包，也可以是网络上的远程资源。
同时，自定义加载器能够实现应用隔离（同一个类这个在一个应用程序使用不同的类加载器中加载多份），例如 Tomcat，Spring等中间件和组件框架都在内部实现了自定义的加载器，并通过自定义加载器隔离不同的组件模块。
*   这种机制比C/C++程序要好太多，想不修改C/C++程序就能为其新增功能，几乎是不可能的，仅仅一个兼容性便能阻挡住所有美好的设想。
自定义类加载器通常需要继承于ClassLoader。
    * */

    
}

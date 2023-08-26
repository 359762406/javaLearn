package com.qihang03.reflectapply.apply1;

/**
 * ClassName: NewInstanceTest
 * Package: com.qihang03.reflectapply.apply1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 22:19
 * @Version 1.0
 */
public class NewInstanceTest {
    /*
    *
1.（掌握)反射的应用1:创建运行时类的对象
1.1 如何实现?
通过Class的实例调用newInstance()方法即可。
1.2要想创建对象成功，需要满足:
条件1:要求运行时类中必须提供一个空参的构造器
条件2:要求提供的空参的构造器的权限要足够。
1.3回忆:JavaBean中要求给当前类提供一个公共的空参的构造器。有什么用?
* >场景1。子类对象在实例化时，子类的构造器的首行默认调用父类空参的构造器。
场景2。在反射中，经常用来创建运行时类的对象。那么我们要求各个运行时类都提供一个空参的构造器，便于我们编写
创建运行时类对象的代码。
1.4
* 在jdk9中标识为过时，替换成什么结构通过Constructor类调用newInstance( . . .)

    * */

}

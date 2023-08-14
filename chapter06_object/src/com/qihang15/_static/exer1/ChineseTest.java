package com.qihang15._static.exer1;

/**
 * ClassName: ChineseTest
 * Package: com.qihang15._static.exer1
 * Description:
 * [修饰符] class 类{
 * 	[其他修饰符] static 数据类型 变量名;
 * }
 * 静态变量的特点
 *  静态变量的默认值规则和实例变量一样。
 *  静态变量值是所有对象共享。
 *  静态变量在本类中，可以在任意方法、代码块、构造器中直接使用。
 *  如果权限修饰符允许，在其他类中可以通过“类名.静态变量”直接访问，也可以通过“对象.静态变量”的方式访问（但是更推荐使用类名.静态变量的方式）。
 *  静态变量的get/set方法也静态的，当局部变量与静态变量重名时，使用“类名.静态变量”进行区分。
 *
 *  静态变量/实例变量
 *  1.个数
 *  >静态变量:在内存空间中只有一份，被类的多个对象所共享。
 *  >实例变量:类的每一个实例（或对象）都保存着一份实例变量。
 *  2.内存位置
 *  >静态变量:jdk6及之前。存放在方法区。jdk7及之后:存放在堆空间
 *  >实例变量:存放在堆空间的对象实体中。
 *  3.加载时机
 *  >静态变量:随着类的加载而加载，由于类只会加载一次，所以静态变量也只有一份。
 *  >实例变量:随着对象的创建而加载。每个对象拥有一份实例变量。
 *  4.调用者
 *  >静态变量:可以被类直接调用，也可以使用对象调用。
 *  >实例变量:只能使用对象进行调用。
 *  5.判断是否可以调用--->从生命周期的角度解释
 *  6.消亡时机
 *  >静态变量。随着类的卸载而消亡
 *  >实例变量:随着对象的消亡而消亡
 *
 *
 *  static修饰方法:（类方法、静态方法)
 *      >随着类的加载而加载
 *      >可以通过“类.静态方法"的方式，直接调用静态方法  (属性和方法的前缀使用的是当前类，可以省略)
 *      >不可以调用非静态的结构。（比如:属性、方法)
 *      static修饰的方法内，不能使用this和super
 *      补充。在类的非静态方法中，可以调用当前类中的静态结构或非静态结构
 *
 *
 *  开发中，什么时候需要将属性声明为静态的?
 *  >判断当前类的多个实例是否能共享此成员变量，且此成员变量的值是相同的。
 *  >开发中，常将一些常量声明是静态的。比如: Math类中的PI
 *  什么时候需要将方法声明为静态的?
 *  >方法内操作的变量如果都是静态变量（而非实例变量）的话，则此方法建议声明为静态方法
 *  >开发中，常常将工具类中的方法，声明为静态方法。比如: Arrays类、Math类
 *
 *
 * @Author 刘起航
 * @Create 2023/7/20 11:49
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.age = 13;
        c1.name = "cadad";
        c1.nation = "china";
        Chinese c2 = new Chinese();
        c1.age = 123;
        c1.name = "fdada";
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.nation);
        System.out.println(c2.nation);
        c2.nation = "CHN";
        System.out.println(c2.nation);
        System.out.println(c1.nation);
    }
}
class Chinese{
    //非静态变量、实例变量
    String name;
    int age;

    //静态变量、类变量
    // 被多个类共享
    static String nation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(String food){
        System.out.println("我喜欢吃" + food);
    }

    public static void show(){
        System.out.println("我是一个中国人");

        //调用静态结构
        System.out.println("nation = " + nation);
        method1();

        //调用非静态方法
//        System.out.println(this.age);
//        eat("123");
    }


    public static void method1(){
        System.out.println("静态测试方法");
    }
}

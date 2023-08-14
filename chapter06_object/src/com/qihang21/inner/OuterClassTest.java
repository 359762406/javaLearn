package com.qihang21.inner;

/**
 * ClassName: OuterClassTest
 * Package: com.qihang21.inner
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 20:05
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建Person的静态的成员内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.eat();
        //2.创建person的非静态的成员内部类的实例
        Person p1 = new Person(19,"tom");
        Person.Bird bird  = p1.new Bird("啄木鸟");
        bird.eat();
        bird.show("123");
        bird.show2();
    }
}

class Person{//外部类
    private int age;
    private String name;
    public void eat(){
        System.out.println("人吃饭");
    }

    //内部类
    /*
    * 成员内部类的使用特征，概括来讲有如下两种角色：
        成员内部类作为类的成员的角色：
        >和外部类不同除了使用public,缺省权限修饰之外，Inner class还可以声明为private或protected；
        >可以调用外部类的结构。（注意：在静态内部类中不能使用外部类的非静态成员）
        >Inner class 可以声明为static的，但此时就不能再使用外层类的非static的成员变量；
        成员内部类作为类的角色：
        >可以在内部定义属性、方法、构造器等结构
        >可以继承自己的想要继承的父类，实现自己想要实现的父接口们，和外部类的父类和父接口无关
        >可以声明为abstract类 ，因此可以被其它的内部类继承
        >可以声明为final的，表示不能被继承
        >编译以后生成OuterClass$InnerClass.class字节码文件（也适用于局部内部类）
    *
    * */
    //静态成员的内部类
    static class  Dog{
        public void eat(){
            System.out.println("狗吃骨头");
        }
    }

    //非静态成员的内部类
    class Bird{
        String name ;

        public Bird(String name) {
            this.name = name;
        }

        public void eat(){
            System.out.println("鸟吃虫子");
        }
        public void show(String name){
            System.out.println("age = " + age);  //省略了Person.this.
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + Person.this.name);
        }
        public void show2(){
            eat();
            this.eat();
            Person.this.eat();
        }
    }
    public void method(){
        //局部内部类
        class InnerClass12{

        }
    }
    public Person(){

    }
    {
        class InnerClass3{

        }
    }
    //局部内部类
    public Comparable getInstance(){
        //提供了实现了Comparable接口的类
        //方式1  提供了接口的实现类的匿名对象
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        MyComparable m = new MyComparable();
        return m;
        //方式2:提供了接口的匿名实现类的匿名对象
//        return new  Comparable(){
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
        //方式3:提供了接口的匿名实现类的对象
//        Comparable c = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//        return c;

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

package com.qihang12._super.exer1;

/**
 * ClassName: Student
 * Package: com.qihang10.extend.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:13
 * @Version 1.0
 */
public class Student extends Person {
    public String  school;
    int id = 101;

    public Student() {
        //-->我们在通过子类的构造器创建对象时，一定在调用子类构造器的过程中，直接或间接的调用到父类的构造器。
        // 也正因为调用过父类的构造器，我们才会将父类中声明的属性或方法加载到内存中，供子类对象使用。|
        super(); //调用父类构造器，且必须在首行
        //this("tom, 12");
        //this(形参列表) 和 super(形参列表) 只能二选一。
        //如果上述二者都没有，默认调用super(),即为父类的空参构造器
        System.out.println("student ... ");
    }

    public Student(String school, int id) {
        //默认调用person() 无参构造器  即为 super()
        this.school = school;
        this.id = id;
    }

    public Student(String name, int age, String school, int id) {
        super(name, age);
        this.school = school;
        this.id = id;
    }

    public void study(){
        System.out.println("学生学习"  + getAge());
    }
    public void sleep(){
        System.out.println("学生至少睡眠8小时");
    }
    public void show(){
        sleep();
        this.sleep();
        super.sleep();
    }
    public void show1(){
        doSports();
        this.doSports();
        super.doSports();
    }
    public void showId(){
        System.out.println(id);
        System.out.println(this.id);
        System.out.println(super.id);
    }

}

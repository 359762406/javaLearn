package com.qihang14.object.tostring.exer1;

/**
 * ClassName: User
 * Package: com.qihang14.object.tostring.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 10:04
 * @Version 1.0
 */
class User{
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "User{name = " + name + ", age = " + age + "}";
//    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

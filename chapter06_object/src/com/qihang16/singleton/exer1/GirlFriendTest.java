package com.qihang16.singleton.exer1;

/**
 * ClassName: GirlFriendTest
 * Package: com.qihang16.singleton.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 17:09
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}

//懒汉式
class GirlFriend{
    //构造器私有化
    private GirlFriend(){

    }
//    声明当前类的实例
    private static GirlFriend instance = null;

//   通过getXXX()获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance() {
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
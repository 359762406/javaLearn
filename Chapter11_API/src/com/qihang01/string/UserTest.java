package com.qihang01.string;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.qihang01.string
 * Description:
 *1．三个类的对比:String、StringBuffer、stringBuilder
 * String:不可变的字符序列;
 * StringBuffer:可变的字符序列; 线程安全的 效率低
 * StringBuilder:可变的字符序列; 线程不安全  效率高
 * @Author 刘起航
 * @Create 2023/8/14 21:49
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("tom", "123");
        users[1] = new User("dad", "453");
        users[2] = new User("fedfd", "087");

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scanner.next();
        System.out.print("请输入密码：");
        String userPassword = scanner.next();

        boolean isExist = false;
        for (User user : users) {
            if (user.getName().equals(userName)) {
                isExist = true;
                if (user.getPassword().equals(userPassword)) {
                    System.out.println("登录成功");
                } else {
                    System.out.println("密码错误");
                }
            }
        }
        if (!isExist){
            System.out.println("查无此人");
        }


        scanner.close();
    }
}

package com.qihang01.string;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.qihang01.string
 * Description:
 *
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

        for (int i = 0; i < users.length; i ++ ){
            if (users[i].getName().equals(userName) &&
                    users[i].getPassword().equals(userPassword)) {
                System.out.println("登录成功");
            }
        }


        scanner.close();
    }
}

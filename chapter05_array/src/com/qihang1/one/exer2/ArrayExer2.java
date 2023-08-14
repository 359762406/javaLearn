package com.qihang1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer2
 * Package: com.qihang1.one.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/12 10:01
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        String[] weeks = new String[7];
        String[] weaks = {"a", "b", "c", "d", "e", "f", "g"};

        Scanner scan = new Scanner(System.in);

        System.out.println("please input 1-7:");

        while (true){
            int day = scan.nextInt();

            if(day <= 7 && day >= 1){
                System.out.println(weaks[day - 1]);
            } else if(day == 0){
                break;
            } else {
                System.out.println("输入有误");

            }
        }

        scan.close();
    }


}

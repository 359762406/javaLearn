package com.qihang1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer3
 * Package: com.qihang1.one.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/12 10:13
 * @Version 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count =  scan.nextInt();
        int[] scores = new int[count];
        int max = 0;
        System.out.println("请输入" + count + "个成绩");
        for(int number = 0 ; number < scores.length; number ++ ){
            scores[number] = scan.nextInt();
            if (max < scores[number]) {
                max = scores[number];
            }
        }


        System.out.println("最高分为：" + max);
//        String[] degree = new String[4];
        String[] degree =  {"A", "B", "C", "D"};
        String studentClass = null;
        for(int number = 0 ; number < scores.length; number ++ ){
            if (scores[number] < 70 && scores[number] >= 0){
                studentClass = degree[3];
            }else if(scores[number] < 80 && scores[number] >= 70) {
                studentClass = degree[2];
            }else if(scores[number] < 90 && scores[number] >= 80) {
                studentClass = degree[1];
            }else{
                studentClass = degree[0];
            }
            System.out.println("student " + number + " score is " + scores[number] + " grade is " + studentClass);
        }
        scan.close();
    }
}

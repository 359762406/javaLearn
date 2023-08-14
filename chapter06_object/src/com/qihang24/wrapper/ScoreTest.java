package com.qihang24.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.qihang24.wrapper
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/24 16:35
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);

        int maxScore = 0;
        while (true) {
            System.out.print("请输入学生成绩（负数代表结束）");


            int intScore = scanner.nextInt();
            if (intScore < 0) {
                break;
            }
//          Integer score = Integer.valueOf(intScore);
//
//          v.addElement(score); //多态

            //jdk5.0之后的自动装箱
            v.addElement(intScore);
            if (maxScore < intScore) {
                maxScore = intScore;
            }
        }
        System.out.println("最高分为：" + maxScore);
        for (int i = 0; i < v.size(); i++) {

            Object objScore = v.elementAt(i);
            //way1
//            Integer intScore = (Integer) objScore;
//            //拆箱
//            int score = intScore.intValue();
            //way2 自动拆箱
            int score = (Integer) objScore;
            System.out.println(score);
        }


        scanner.close();
    }
}

package com.qihang3.common_algorithm.exer4;

import java.util.Scanner;

/**
 * ClassName: ArrayReverseTest
 * Package: com.qihang3.common_algorithm.exer4
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 10:30
 * @Version 1.0
 */
public class ArrayReverseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数字：");
        int number = scan.nextInt();
        int[] arr1 = new int[number];

        for (int i = 0; i < arr1.length; i ++ ){
            arr1[i] = i + 1;
        }
        int temp;
        for (int i = 0; i < ((arr1.length) / 2); i ++ ){
            temp = arr1[arr1.length - i - 1];
            arr1[arr1.length - 1 - i] = arr1[i];
            arr1[i] = temp;
        }
        for (int i = 0; i < arr1.length; i ++ ){
            System.out.print(arr1[i] + "\t");
        }
        scan.close();
    }
}
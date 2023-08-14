package com.qihang1.one;

/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/11 21:31
 * @Version 1.0
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OneArrayTest {
    public static void main(String[] args) {
        //array的初始化
        int num1 = 101;
        int num2;
        num2 = 100;
        //声明数组
        double[] prices;
        //数组初始化
        prices = new double[]{20.33, 30.45, 40.43};

        String[] fools = new String[4];

        int[] arr = new int[4];
        int[] arr1 = {1, 2, 3, 4};
        //遍历数组
        for(int i = 0; i < arr1.length; i ++){
            System.out.println(arr1[i]);
        }
    }
}
package com.qihang3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.qihang3.common_algorithm.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/12 17:17
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i ++ ){
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            System.out.println(arr[i]);
            sum += arr[i];
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i ++ ){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为:" + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i ++ ){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为:" + min);

        System.out.println("总和为:" + sum);

        int avgValue = sum / arr.length;
        System.out.println("平均值为:" + avgValue);

    }
}

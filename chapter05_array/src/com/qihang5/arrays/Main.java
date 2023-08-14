package com.qihang5.arrays;

import java.util.Arrays;

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
public class Main {
    public static void main(String[] args) {
        //比较两个数组的内容是否相同
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};

        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        arr2 = new int[]{1,2,3,2,3,1};
        isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);


        //输出数组的元素信息
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        //指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //使用快速排序，排序数组
        int[] arr3 = new  int[]{1,2,3,4,5,2,1,3,1,2,3,232,4532,51};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //二分查找，前提是排好序
        int index = Arrays.binarySearch(arr3,2);
        System.out.println(index);
    }
}
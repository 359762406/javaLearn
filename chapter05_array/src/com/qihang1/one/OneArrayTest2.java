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
public class OneArrayTest2 {
    public static void main(String[] args) {
        //new才会新申请地址空间
        //数组元素的默认的初始化值
        double[] arr1 = new double[3]; // 0.0
        System.out.println(arr1[0]);
        int[] arr2 = new int[3];  // 0
        System.out.println(arr2[0]);
        String[] arr3 = new String[3]; // null
        System.out.println(arr3[0]);
        char[] arr4 = new char[3]; // '0' or '\u0000'
        System.out.println(arr4[0]);


        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        //定义数组变量intArray2, 将intArray的地址赋值给intArray2
        int[] intArray2 = intArray;
        intArray2[1] = 8;
        System.out.println(intArray[1]);
        System.out.println(intArray2);
        System.out.println(intArray);
    }
}
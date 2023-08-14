package com.qihang3.common_algorithm.exer3;

/**
 * ClassName: ArrayTest04
 * Package: com.qihang3.common_algorithm.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 10:17
 * @Version 1.0
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,1,3,4,1,2,4,};
        for (int i  = 0; i < array1.length; i ++ ){
            System.out.print(array1[i] + "\t");
        }
        //array1赋值array2
        array2 = array1;
        System.out.println();
        System.out.println(array1 + "  array1");
        System.out.println(array2 + "  array2"); //地址相同



        for (int i  = 0; i < array2.length; i ++ ){
            if (i % 2 == 0){
                array2[i] = i;
            }
        }
        for (int i  = 0; i < array1.length; i ++ ){
            System.out.print(array1[i] + "\t");
        }
        //array1复制给array2
        int[] array3 = new int[array1.length]; // 申请新的地址空间
        for (int i = 0; i < array3.length; i ++ ){
            array3[i] = array1[i];
        }
        array2 = array1;
        System.out.println();
        System.out.println(array1 + "  array1");
        System.out.println(array3 + "  array3"); // 地址不同
        for (int i  = 0; i < array3.length; i ++ ){
            System.out.print(array3[i] + "\t");
        }
    }
}

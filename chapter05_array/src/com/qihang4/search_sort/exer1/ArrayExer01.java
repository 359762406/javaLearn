package com.qihang4.search_sort.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.qihang4.search_sort.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 11:47
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //数组扩容
        int[] arr = new int[]{1,2,3,4,5};

        int[] arr2 = new int[arr.length << 1];

        for (int i = 0; i < arr.length; i ++ ){
            arr2[i] = arr[i];
        }

        arr2[arr.length] = 10;
        arr2[arr.length + 1] = 20;
        arr2[arr.length + 2] = 30;

        arr = arr2; // 垃圾回收机制会将不可达堆空间的变量释放
        for (int i = 0; i < arr.length; i ++ ){
            System.out.print(arr2[i] + "\t");
        }
    }
}

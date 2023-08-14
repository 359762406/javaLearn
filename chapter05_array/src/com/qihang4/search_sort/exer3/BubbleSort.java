package com.qihang4.search_sort.exer3;

/**
 * ClassName: BubbleSort
 * Package: com.qihang4.search_sort.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 17:18
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new  int[]{1,2,3,4,5,2,1,3,1,2,3,232,4532,51};

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0 ; j < arr.length - 1 - i; j ++ ){
                if (arr[j + 1] >= arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

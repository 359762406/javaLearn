package com.qihang4.search_sort.exer3;

import java.util.Arrays;

/**
 * ClassName: QuickSort
 * Package: com.qihang4.search_sort.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 17:31
 * @Version 1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new  int[]{2,1,2,34,131,514,23121,54111,2,0,-1,31,-2323};
        int begin = 0;
        int end = arr.length - 1;
        QuickSort sortMethod  = new QuickSort();

        sortMethod.quickSortMethod(arr, begin, end);

        System.out.println(Arrays.toString(arr));;



    }
    public void quickSortMethod(int[] arr, int begin, int end){
        if(begin >= end){
            return;
        }
        int x = begin - 1, y = end + 1;
        int key = arr[begin + end >> 1];
        while (x < y){
            while (arr[++ x] < key){
                continue;
            }
            while (arr[-- y] > key){
                continue;
            }
            if (x < y){
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
        }
        quickSortMethod(arr, begin, y);
        quickSortMethod(arr, y + 1, end);
    }

}

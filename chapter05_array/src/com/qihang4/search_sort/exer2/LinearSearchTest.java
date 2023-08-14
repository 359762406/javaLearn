package com.qihang4.search_sort.exer2;

/**
 * ClassName: LinearSearchTest
 * Package: com.qihang4.search_sort.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 14:49
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{23,34,232,12,44,32,55,64,342,6789,9};

        int target = 34;
        boolean findTrue = false;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]){
                System.out.println("find it!" + " locate in " + i);
                findTrue = true;
            }

        }
        if (findTrue == false){
            System.out.println("cannot find it!");
        }

    }
}

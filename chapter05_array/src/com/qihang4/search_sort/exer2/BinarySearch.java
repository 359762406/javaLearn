package com.qihang4.search_sort.exer2;

/**
 * ClassName: BinarySearch
 * Package: com.qihang4.search_sort.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/13 15:33
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,2,2,4,5,5,5,5,8,12,15,19,26,37,49,51,66,89,100};

        int target = 5;
//        int begin1 = 0, end1 = arr1.length - 1;
//        while(begin1 < end1){ // right
//            int mid1 = (begin1 + end1) >> 1;
//
//            if (arr1[mid1] >= target){
//                end1 = mid1;
//            }else {
//                begin1 = mid1 + 1;
//            }
//            System.out.println(begin1 + "\t" + end1);
//        }
//        System.out.println(begin1 + "\t" + end1);
//        System.out.println();
//        int begin2 = 0, end2 = arr1.length - 1;
//        while(begin2 < end2){ // lift
//            int mid2 = (begin2 + end2 + 1) >> 1;
//            if(arr1[mid2] <= target){
//                begin2 = mid2;
//            }else{
//                end2 = mid2 - 1;
//            }
//            System.out.println(begin2 + "\t" + end2);
//        }
//        System.out.println();
//        System.out.println(begin1 + "\t" + end2);
        int begin = -1, end = arr1.length;
        while (begin + 1 != end){
            int mid = begin + end >> 1;
            if (arr1[mid] >= target) {
                end = mid;
            }else{
                begin = mid;
            }
        }

        System.out.println(begin + "\t" + end);
        begin = -1;
        end = arr1.length;
        while(begin + 1 != end){
            int mid = begin + end >> 1;
            if (arr1[mid] <= target){
                begin = mid;
            }else{
                end = mid;
            }

        }
        System.out.println(begin + "\t" + end);

    }
}

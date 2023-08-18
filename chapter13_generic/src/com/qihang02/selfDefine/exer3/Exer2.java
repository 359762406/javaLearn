package com.qihang02.selfDefine.exer3;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: Exer2
 * Package: com.qihang02.selfDefine.exer3
 * Description:
 *编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 * @Author 刘起航
 * @Create 2023/8/18 16:02
 * @Version 1.0
 */
public class Exer2 {
    public static <E> void sawp(E[] arr, int a, int b){
        E temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static <E> void reverse(E[] arr){
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            E temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","BB", "CC", "DD","SS"};
        sawp(arr, 0, 2);
//        for (String obj : arr){
//            System.out.println(obj);
//        }
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

}

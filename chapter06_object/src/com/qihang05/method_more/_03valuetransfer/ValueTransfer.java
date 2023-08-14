package com.qihang05.method_more._03valuetransfer;

import java.util.Arrays;

/**
 * ClassName: ValueTransfer
 * Package: com.qihang05.method_more._03valuetransfer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 17:10
 * @Version 1.0
 */
public class ValueTransfer {
    public static void main(String[] args) {
        /**
         * 如果是基本数据类型的变量，则将此变量保存的数据值何递出去。
         * 如果是引用数据类型的变量，则将此变量保存的地址值传递出去。
         */

        ValueTransfer trans = new ValueTransfer();
        int a  = 10;
        trans.add(a);
        System.out.println(a);
        String str = "abc"; // String是不可变的，因为String类被Final修饰，放在这看不出效果
        trans.add(str);
        System.out.println(str);
        int[] arr = new int[]{1,2,3,0,0};

        trans.add(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void add(int a){
        a ++;
        System.out.println(a);
    }
    public void add(String a){
        a += "hello";
    }

    public void add(int[] arr){
        arr[0] = 10;
    }
}

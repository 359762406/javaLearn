package com.qihang05.method_more._02args;

/**
 * ClassName: ArgsTest
 * Package: com.qihang05.method_more._02args
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 16:18
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest args1 = new ArgsTest();
        args1.add(new int[]{1, 2, 3});
//        args1.add(1, 2, 3);
    }
    /**
     * 可变形参方法名相同的情况下，且与 可变个数形参的类型的数组参数 不构成重载
     * 可变个数的形参最多在一个方法的形参列表中出现一次
     * @param num 可变个数形参
     */
    public void add(int ... num){ //'add(int...)' is already defined in 'com.qihang05.method_more._02args.ArgsTest'
//        System.out.println("1");
        for (int i = 0; i < num.length; i ++ ){
            System.out.print(num[i] + "\t");
        }
        System.out.println();
    }

//    public void add(int[] num){
//
//    }

    /**
     * 可变个数的形参必须声明到形参列表的最后
     * @param a 一个
     * @param num 可变个数形参
     */
    public void add(int a, int ... num){

    }
//    public void add(int ...num, int a){
//
//    }
}

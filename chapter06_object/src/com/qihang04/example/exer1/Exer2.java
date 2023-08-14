package com.qihang04.example.exer1;

/**
 * ClassName: Exer2
 * Package: com.qihang04.example.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 10:45
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {

        Exer2 e1 = new Exer2();
        e1.method1();
        System.out.println();
        e1.method1(10,8);
        System.out.println();
        int area = e1.method2(9,8);
        System.out.println("面积为：" + area);
    }
    public void method1(){
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 2; j ++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
    public void method1(int m, int n){
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public int method2(int m, int n){
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
//        int area = m * n;
        return m * n;
    }
}

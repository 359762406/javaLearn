package com.qihang3.common_algorithm.exer2;

import java.util.Scanner;

/**
 * ClassName: HuiXingShu
 * Package: com.qihang3.common_algorithm.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/12 21:33
 * @Version 1.0
 */
public class HuiXingShu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[][] number = new int[count][count];
        int s = count * count;
        /*
        * k = 1 ->
        * k = 2 down
        * k = 3 <-
        * k = 4 up
        * */
        int k = 1;
        int i = 0, j =0;
        for(int m = 1; m <= s; m ++ ){
            if (k == 1){
                if (j < count && number[i][j] == 0){
                    number[i][j++] = m;
                } else {
                    System.out.println("i:" + i);
                    System.out.println("j:" + j);
                    System.out.println("m:" + m);
                    k = 2;
                    i ++ ;
                    j -- ;
                    m -- ;
                }

            } else if (k == 2) {
                if (i < count && number[i][j] == 0){
                    number[i++][j] = m;
                } else {
                    System.out.println("i:" + i);
                    System.out.println("j:" + j);
                    System.out.println("m:" + m);
                    k = 3;
                    j -- ;
                    i -- ;
                    m -- ;
                }


            } else if (k == 3) {
                if (j >= 0 && number[i][j] == 0){
                    number[i][j--] = m;
                }else {
                    System.out.println("i:" + i);
                    System.out.println("j:" + j);
                    System.out.println("m:" + m);
                    k = 4;
                    i -- ;
                    j ++ ;
                    m -- ;
                }

            } else if (k == 4) {
                if(i >= 0 && number[i][j] == 0){
                    number[i--][j] = m;
                }else{
                    System.out.println("i:" + i);
                    System.out.println("j:" + j);
                    System.out.println("m:" + m);
                    k = 1;
                    j ++ ;
                    i ++ ;
                    m -- ;
                }


            }

        }
        for (int x = 0; x < count;  x++ ){
            for (int y = 0 ; y < count; y ++ ){
                System.out.print(number[x][y]+"\t");
            }
            System.out.println();
        }
    }
}

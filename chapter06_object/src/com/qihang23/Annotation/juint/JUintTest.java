package com.qihang23.Annotation.juint;


import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUintTest
 * Package: com.qihang23.Annotation.juint
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/24 14:57
 * @Version 1.0
 */
public class JUintTest {
    int number = 1;

    public JUintTest() {
    }

    @Test
    public void test1(){
        System.out.println("hello");
    }

    @Test
    public void test2(){
        System.out.println("hello1");
        System.out.println("number = " + number);
        test1();
    }
    @Test
    public void test3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数值：");
        int num = scan.nextInt();
        System.out.println(num);
    }
    @Test
    public void test (){
        
    }
    
    


}

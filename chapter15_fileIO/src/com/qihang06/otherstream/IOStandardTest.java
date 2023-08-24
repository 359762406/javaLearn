package com.qihang06.otherstream;

import org.junit.Test;

import java.io.*;
import java.util.TreeSet;

/**
 * ClassName: IOstandardTest
 * Package: com.qihang06.otherstream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 17:54
 * @Version 1.0
 */
public class IOStandardTest {
    /*
    * system.in 标准输入流
    * system.out 标准输出流
    * */
    @Test
    public void test1() throws FileNotFoundException {
        PrintStream ps = new PrintStream("io.txt");
        ps.println("hello");
        ps.println(1);
        ps.println(1.5);


        System.setOut(ps);
        System.out.println("你好");
        ps.close();
    }
    @Test
    public void test2(){
        PrintStream ps = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("F:\\rs\\abc.txt"));
            // 创建打印输出流，设置为自动刷新模式（写入换行符或者字节'\n'时都会刷新输出缓冲区）
            ps = new PrintStream(fos, true);
            if(ps != null){
                System.setOut(ps);
            }
            for(int i = 0; i <= 255; i++){
                System.out.print((char)i);
                if(i % 50 == 0){
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test4(){
        Logger.log("121212");
        Logger.log("dawddada ");
        Logger.log("dawdaf发起吴大维大的服务");
    }
    @Test
    public void test5(){
        File srcFile =new File("dogImage.jpg");
        File destFile =new File("dogImageCopy.jpg");

    }




}

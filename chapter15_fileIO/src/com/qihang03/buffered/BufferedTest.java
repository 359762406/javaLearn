package com.qihang03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedTest
 * Package: com.qihang03.buffered
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/23 22:04
 * @Version 1.0
 */
public class BufferedTest {
    /*
为了提高数据读写的速度，Java API提供了带缓冲功能的流类：缓冲流。
缓冲流要“套接”在相应的节点流之上，根据数据操作单位可以把缓冲流分为：

字节缓冲流：BufferedInputStream，BufferedOutputStream 文本文件
read(char[] cbuffer)/readLine(); write(char[] cbuffer, 0, len)
字符缓冲流：BufferedReader，BufferedWriter 非文本文件
read(byte[] buffer) write(byte[] buffer, 0, len)
缓冲流的基本原理：在创建流对象时，内部会创建一个缓冲区数组（缺省使用8192个字节(8Kb)的缓冲区），通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
    * */

    /*
    * 使用
    * */
    @Test
    public void test() throws IOException {
        File srcfile = new File("Hello.txt");
        File destfile = new File("HelloCopy.txt");
        //创建字节流和缓冲流
        //内层
        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destfile);
        //外层
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] buffer = new byte[1024];
        int len;
        while((len = bis.read(buffer)) != -1){
            bos.write(buffer, 0, len);
        }
        System.out.println("复制成功");

        //外层流关闭,会自动化的关闭内层的关闭
        bos.close();
        bis.close();
       /* //内层流关闭
        fos.close();
        fis.close();*/
    }

}

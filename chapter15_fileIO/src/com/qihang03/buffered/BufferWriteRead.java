package com.qihang03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BuffrtWriteRead
 * Package: com.qihang03.buffered
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/23 22:38
 * @Version 1.0
 */
public class BufferWriteRead {
    /*
    * 使用BufferReader 读取文件
    * */
    @Test
    public void test1() throws IOException {
        File file = new File("Hello.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //读取的过程
        //way1 read(char[] cBuffer);
//        char[] chars = new char[1024];
//        int len;
//        while((len = br.read(chars)) != -1){
//            String str = new String(chars, 0, len);
//            System.out.println(str);
//        }
        //way2 readLine() 每次读取一行的数据
        String str;
        while((str = br.readLine()) != null){
            System.out.print(str + "\n");
        }
        br.close();
    }
    @Test
    public void test2() throws IOException {
        File file1 = new File("Hello.txt");
        File file2 = new File("HelloCopy1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        String str;
        while((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();
            bw.flush(); // 调用此方法，就会主动的将内存中的数据写出到磁盘文件中
        }
        System.out.println("复制成功");
        br.close();
        bw.close();
    }
    
}

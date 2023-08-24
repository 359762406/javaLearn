package com.qihang04.inputstreamreader;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: InputStreamTest
 * Package: com.qihang04.inputstreamreader
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 10:04
 * @Version 1.0
 */
public class InputStreamTest {
    /*
    * 转换流：实现字节和字符之间的转换
    * */

    /*
    * 转换流java.io.InputStreamReader，是Reader的子类，是从字节流到字符流的桥梁。
    * 它读取字节，并使用指定的字符集将其解码为字符。
    * 它的字符集可以由名称指定，也可以接受平台的默认字符集。
    * */
    @Test
    public void test1() throws IOException {
        File file1 = new File("Hello.txt");
        FileInputStream fis  = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); // 读取字节，解码为字符, 使用的IDEA默认的UTF-8字符集
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr.read(cBuffer)) != -1){
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }
        isr.close();
    }
    /*
    解码和编码的字符集需要相同
    * */
    @Test
    public void test2() throws IOException {
        File file1 = new File("Hello.txt");
        FileInputStream fis  = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis, "GBK"); // 读取字节，解码为字符, 使用的IDEA默认的UTF-8字符集
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr.read(cBuffer)) != -1){
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }
        isr.close();
    }
    @Test
    public void test3() throws IOException {
        File file1 = new File("Hello.txt");
        File file2 = new File("hello_UTF-8ToGBK.txt");
        FileInputStream fis  = new FileInputStream(file1); //字节流
        InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // 读取字节，解码为字符, 使用的IDEA默认的UTF-8字符集
        FileOutputStream fos = new FileOutputStream(file2);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr.read(cBuffer)) != -1){
            osw.write(cBuffer,0,len);
            osw.flush();
        }
        isr.close();
        osw.close();
    }


}

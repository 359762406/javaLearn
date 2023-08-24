package com.qihang02.fileStream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileStreamTest
 * Package: com.qihang02.fileStream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/23 21:19
 * @Version 1.0
 */
public class FileStreamTest {
    /*
对于字符流，只能用来操作文本文件，不能用来处理非文本文件的。 文本：.txt .java .c .cpp
对于字节流，通常是用来处理非文本文件的。但是，如果涉及到文本文件的复制操作，也可以使用字节流。.doc .xlc .jpg .pdf ...
    * */
    /*
    * 字节输入流：InputStream
java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。

public int read()： 从输入流读取一个字节。返回读取的字节值。虽然读取了一个字节，但是会自动提升为int类型。如果已经到达流末尾，没有数据可读，则返回-1。
public int read(byte[] b)： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。每次最多读取b.length个字节。返回实际读取的字节个数。如果已经到达流末尾，没有数据可读，则返回-1。
public int read(byte[] b,int off,int len)：从输入流中读取一些字节数，并将它们存储到字节数组 b中，从b[off]开始存储，每次最多读取len个字节 。返回实际读取的字节个数。如果已经到达流末尾，没有数据可读，则返回-1。
public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
说明：close()方法，当完成流的操作时，必须调用此方法，释放系统资源。
    * */
    /*
    * 字节输出流：OutputStream
java.io.OutputStream抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。

public void write(int b) ：将指定的字节输出流。虽然参数为int类型四个字节，但是只会保留一个字节的信息写出。
public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
说明：close()方法，当完成流的操作时，必须调用此方法，释放系统资源。
    * */
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("picture.jpg");
            File destFile = new File("pictureCopyStream.jpg");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                assert fis != null;
                fis.close();
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    
}

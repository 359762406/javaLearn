package com.qihang02.fileStream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: IOStreamTest
 * Package: com.qihang02.fileStream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/23 9:32
 * @Version 1.0
 */
public class IOStreamTest {
    /*
    * input/output stream
    * */

    /*
    按数据的流向不同分为：输入流和输出流。
        输入流 ：把数据从其他设备上读取到内存中的流。
            以InputStream、Reader结尾
        输出流 ：把数据从内存 中写出到其他设备上的流。
            以OutputStream、Writer结尾
    按操作数据单位的不同分为：字节流（8bit）和字符流（16bit）。
        字节流 ：以字节为单位，读写数据的流。
            以InputStream、OutputStream结尾
        字符流 ：以字符为单位，读写数据的流。
            以Reader、Writer结尾
    根据IO流的角色不同分为：节点流和处理流。
        节点流：直接从数据源或目的地读写数据
        处理流：不直接连接到数据源或目的地，而是“连接”在已存在的流（节点流或处理流）之上
               ，通过对数据的处理为程序提供更为强大的读写功能。
    * */
    /*
常用的节点流：
    文件流： FileInputStream、FileOutputStrean、FileReader、FileWriter
    字节/字符数组流： ByteArrayInputStream、ByteArrayOutputStream、CharArrayReader、CharArrayWriter
        对数组进行处理的节点流（对应的不再是文件，而是内存中的一个数组）。
常用处理流：
    缓冲流：BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter
        作用：增加缓冲功能，避免频繁读写硬盘，进而提升读写效率。
    转换流：InputStreamReader、OutputStreamReader
        作用：实现字节流和字符流之间的转换。
    对象流：ObjectInputStream、ObjectOutputStream
        作用：提供直接读写Java对象功能
    */
    @Test
    public void test1() throws IOException {
        //创建输入型字符流，用于读取数据
        FileReader fr = null;
        try {
            //创建File类的对象，对应者Hello.txt
            File file = new File("Hello.txt");
            fr = new FileReader(file);
            //读取数据，并显示在控制台上
            /*
            * way1
            * */
//            int data = fr.read();
//            while(data != -1){
//                System.out.print((char)data);
//                data = fr.read();
//            }
            /*
            * way2
            * */
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //流资源的关闭操作

            assert fr != null;
            fr.close();
        }
    }
    @Test
    public void test2() throws IOException {
        //创建输入型字符流，用于读取数据
        FileReader fr = null;
        try {
            //创建File类的对象，对应者Hello.txt
            File file = new File("Hello.txt");
            fr = new FileReader(file);
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1){
                for(char c : cbuffer){
                    System.out.print(c);
                }
                len = fr.read(cbuffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //流资源的关闭操作

            assert fr != null;
            fr.close();
        }
    }
    @Test
    public void test3(){
        File file = new File("info.txt");
        if(!file.exists()){
            try {
                boolean newFile = file.createNewFile();
                if(!newFile){
                    System.out.println("文件不存在，且创建失败");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try {
//            fileWriter = new FileWriter(file,false); //写入覆盖
            fileWriter = new FileWriter(file,true); // 追加写入
            fileWriter.write("qeqeqwe" + "\n");
            fileWriter.write("dadefes"+ "\n");
            fileWriter.write("dad2d12e"+ "\n");
            System.out.println("输出成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
    copy文件
     */
    @Test
    public void testCopy() throws IOException {
        File fileOrigin = new File("Hello.txt");
        File fileCopy = new File("Hello_copy.txt");
        if(!fileCopy.exists()){
            try {
                boolean newFile = fileCopy.createNewFile();
                if(newFile){
                    System.out.println("创建成功");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileOrigin);
            fileWriter = new FileWriter(fileCopy,false);
            int data;
            while((data = fileReader.read()) != -1){
                fileWriter.write((char)data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            assert fileReader != null;
            fileReader.close();
            assert fileWriter != null;
            fileWriter.close();
        }
    }
    /*
    * 字符流不适合处理非文本文件
    * */
    @Test
    public void testCopyImage(){


        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            File fileOrigin = new File("picture.jpg");
            File fileCopy = new File("pictureCopy.jpg");
            fileReader = new FileReader(fileOrigin);
            fileWriter = new FileWriter(fileCopy,false);
            int data;
            while((data = fileReader.read()) != -1){
                fileWriter.write((char)data);
            }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {


            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    
    

    
}

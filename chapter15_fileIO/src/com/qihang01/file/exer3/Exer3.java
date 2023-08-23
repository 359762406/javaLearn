package com.qihang01.file.exer3;

import com.qihang01.file.FileConstructor;
import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer3
 * Package: com.qihang01.file.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/22 22:46
 * @Version 1.0
 */
public class Exer3 {
    @Test
    public void test1(){
        File file = new File("K:\\picture");
        printFileName(file);
    }
    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File f : listFiles){
                printFileName(f);
            }
        }
    }/*
    File 能新建、删除、重命名文件和目录，但 File 不能访问文件内容本身。
        如果需要访问文件内容本身，则需要使用输入/输出流。
    File对象可以作为参数传递给流的构造器。
    File类的对象，通常是作为IO流操作的文件端点出现的
    */

}

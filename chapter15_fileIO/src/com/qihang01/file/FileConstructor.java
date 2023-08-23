package com.qihang01.file;

import org.junit.Test;

import java.io.File;
import java.sql.SQLOutput;

/**
 * ClassName: FileConstructor
 * Package: com.qihang01.file
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/22 17:56
 * @Version 1.0
 */
public class FileConstructor {
    /*
    *
    public File(String pathname) ：以pathname为路径创建File对象，可以是绝对路径或者相对路径，
    *   如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。
    public File(String parent, String child) ：以parent为父路径，child为子路径创建File对象。
    public File(File parent, String child) ：根据一个父File对象和子文件路径创建File对象
    * */
    /*
    * 关于路径：
**绝对路径：**从盘符开始的路径，这是一个完整的路径。
**相对路径：**相对于 项目目录 的路径，这是一个便捷的路径，开发中经常使用。
IDEA中，main中的文件的相对路径，是相对于"当前工程"
IDEA中，单元测试方法中的文件的相对路径，是相对于"当前module"
    * */
    @Test
    public void test1(){
        File file1 = new File("F:\\javaPro\\javaLearn\\chapter15_fileIO\\src\\com\\qihang01\\file\\File类的使用.txt");
        File file2 = new File("File类的使用.txt");
        System.out.println(file2.getAbsoluteFile());
    }
    @Test
    public void test2(){
//public File(String parent, String child) ：以parent为父路径，child为子路径创建File对象。
        //parent:一定时一个文件目录
        //child：可以是一个文件，也可以是一个文件目录
        new File("F:\\rs", "abc.txt");
    }
    

}

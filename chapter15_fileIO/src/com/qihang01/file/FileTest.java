package com.qihang01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest
 * Package: com.qihang01.file
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/22 21:38
 * @Version 1.0
 */
public class FileTest {
    /*
    public String getName() ：获取名称
    public String getPath() ：获取路径
    public String getAbsolutePath()：获取绝对路径
    public File getAbsoluteFile()：获取绝对路径表示的文件
    public String getParent()：获取上层文件目录路径。若无，返回null
    public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
    public long lastModified() ：获取最后一次的修改时间，毫秒值public String getName() ：获取名称
    public String getPath() ：获取路径
    public String getAbsolutePath()：获取绝对路径
    public File getAbsoluteFile()：获取绝对路径表示的文件
    public String getParent()：获取上层文件目录路径。若无，返回null
    public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
    public long lastModified() ：获取最后一次的修改时间，毫秒值
    *
    * */
    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        System.out.println(file1.getName());
    }
    /*
    public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
    * */


    /*
    * public boolean renameTo(File dest):把文件重命名为指定的文件路径。
     * */
    public static void main(String[] args) throws IOException {

        File file1 = new File("hello.txt");
        File file2 = new File("f:\\rs\\abc.txt");
        if(!file1.exists()){
            boolean isSucceed = file1.createNewFile();
            if(isSucceed){
                System.out.println("创建成功");
            }
        }else{
            System.out.println("此文件已存在");
        }
        boolean renameSuccess = file1.renameTo(file2);
        System.out.println(renameSuccess?"success":"fail");
    }


}

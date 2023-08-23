package com.qihang01.file.exer1;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Exer1
 * Package: com.qihang01.file.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/22 22:33
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("hello.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile().getParent());
        File file2 = new File(file1.getAbsoluteFile().getParent(), "abc.txt");
        boolean exists = file2.exists();
        System.out.println(exists);
        if (!file2.exists()){
            boolean newFile = file2.createNewFile();
        }
    }
}

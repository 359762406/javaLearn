package com.qihang01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer2
 * Package: com.qihang01.file.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/22 22:39
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        File dir =  new File("K:\\picture\\导出\\未命名导出");
//        String[] list = dir.list();
//        for (String s : list){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }
        String[] list1 = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".jpg")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String s : list1){
            System.out.println(s);
        }
    }
    
}

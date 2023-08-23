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

package com.qihang05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.qihang05.map
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 21:09
 * @Version 1.0
 */
public class PropertiesTest {
    @Test
    public void test1(){
        //数据和代码的耦合度较高
        //数据
        String name = "tom";
        String password = "sdada";

        //代码 操作 name和password
        //...
    }
    @Test //文件在一个module中  main文件在project里
    public void test2() throws IOException {
        //方式2:将数据封装到具体的配置文件中，在程序中读取配置文件中的信息。
        //实现了数据和代码的解耦;由于我们没有修改代码，就省去了重新编译和打包的过程。
        File file = new File("info.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties pros = new Properties();
        pros.load(fileInputStream);  //加载流中文件中的数据

        String name = pros.getProperty("name");
        String pwd = pros.getProperty("password");
        System.out.println(name + " " + pwd);
        fileInputStream.close();
    }


}

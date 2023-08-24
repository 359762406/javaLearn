package com.qihang06.otherstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Logger
 * Package: com.qihang06.otherstream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/24 20:43
 * @Version 1.0
 */
public class Logger {
    public static void log(String msg){
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("log.txt", true));
            System.setOut(out);
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime  = sdf.format(nowTime);
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

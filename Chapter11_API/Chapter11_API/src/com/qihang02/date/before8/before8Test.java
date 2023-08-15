package com.qihang02.date.before8;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: before8Test
 * Package: com.qihang02.date.before8
 * Description:
 *  l--java.util.Date>两个构造器的使用
 * >两个方法的使用:toString() long getTime()
 *     l----java.sql.Date:对应着数据库中的date类型
 * @Author 刘起航
 * @Create 2023/8/15 9:45
 * @Version 1.0
 */
public class before8Test {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        Date date1 = new Date(); //创建系统时间的实例
        System.out.println(date1.toString());
    }
    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1692064023138L);
        System.out.println(date1);
    }
    /*
     * SimpleDateFormat类:用于日期时间的格式化和解析
     *格日期--->字符串
     *解析:字符串--->日期
     **/
    @Test
    public void test3(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
    /*
    * Calendar:日历类
    * ①实例化由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
    *        getInstance()即可获取
    *
    **/
    @Test
    public void test4(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }


}

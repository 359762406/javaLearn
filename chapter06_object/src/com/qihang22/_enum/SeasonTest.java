package com.qihang22._enum;

/**
 * ClassName: SeasonTest
 * Package: com.qihang22._enum
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/24 9:30
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.toString());

    }
}

//jdk5.0实现方式
class Season{
    //2.声明当前类的实例变量
    private final String seasonName;
    private final String SeasonDesc;

    //1.私有化类的构造器
    private Season(String seasonName, String SeasonDesc){
        this.seasonName = seasonName;
        this.SeasonDesc = SeasonDesc;
    }


    //3.实现get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }
    //4.创建当前类的实例
    public static final Season SPRING =  new Season("spring", "春暖花开");
    public static final Season SUMMER =  new Season("summer", "夏日");

    public static final Season AUTUMN =  new Season("autumn", "秋高气爽");

    public static final Season WINTER =  new Season("winter", "白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}

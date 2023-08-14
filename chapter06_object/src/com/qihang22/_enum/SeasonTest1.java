package com.qihang22._enum;

/**
 * ClassName: SeasonTest1
 * Package: com.qihang22._enum
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/24 9:48
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        /*
        *
        *   class com.qihang22._enum.Season1
            class java.lang.Enum
            class java.lang.Object
        * */
        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SPRING.getClass().getSuperclass());
        System.out.println(Season1.SPRING.getClass().getSuperclass().getSuperclass());

        System.out.println(Season1.SPRING);
        /*
        *   String toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！

            static 枚举类型[] values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值，是一个静态方法

            static 枚举类型 valueOf(String name)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。
            如不是，会有运行时异常：IllegalArgumentException。

            String name():得到当前枚举常量的名称。建议优先使用toString()。

            int ordinal():返回当前枚举常量的次序号，默认从0开始*/
        System.out.println(Season1.SUMMER.name());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        //valueOf(String objName)
        String objName = "WINTER";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        System.out.println(Season1.AUTUMN.ordinal());
        season1.show();
        Season1.SPRING.show();

    }
}
interface Info{
    public abstract void show();
}
//jdk5.0中声明枚举类
enum Season1 implements Info{
    //1．必须在枚举类的开头声明多个对象。对象之间使用，隔开
    SPRING("spring", "春暖花开"),
    SUMMER("summer", "夏日"),

    AUTUMN("autumn", "秋高气爽"),

    WINTER("winter", "白雪皑皑");

    //2.声明当前类的实例变量
    private final String seasonName;
    private final String SeasonDesc;

    //3.私有化类的构造器
    private Season1(String seasonName, String SeasonDesc){
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

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}

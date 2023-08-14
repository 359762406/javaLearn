package com.qihang22._enum;

/**
 * ClassName: SeasonTest2
 * Package: com.qihang22._enum
 * Description:
 *  实现接口的枚举类
 *      和普通 Java 类一样，枚举类可以实现一个或多个接口
 *      若每个枚举值在调用实现的接口方法呈现相同的行为方式，则只要统一实现该方法即可。
 *      若需要每个枚举值在调用实现的接口方法呈现出不同的行为方式，则可以让每个枚举值分别来实现该方法，执行的不同的方法
 *
 * @Author 刘起航
 * @Create 2023/7/24 10:08
 * @Version 1.0
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        Season2[] value = Season2.values();
        for (int i = 0; i < value.length; i++) {
            value[i].show();
        }
    }

}
interface Info1{
    public abstract void show();
}
//jdk5.0中声明枚举类
enum Season2 implements Info1{
    //1．必须在枚举类的开头声明多个对象。对象之间使用，隔开
    SPRING("spring", "春暖花开"){
        public void show(){
            System.out.println("春天在哪里");
        }
    },
    SUMMER("summer", "夏日"){
        public void show(){
            System.out.println("宁静的夏天");
        }
    },

    AUTUMN("autumn", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋意浓");
        }
    },

    WINTER("winter", "白雪皑皑"){
        @Override
        public void show() {
            System.out.println("冬季");
        }
    };

    //2.声明当前类的实例变量
    private final String seasonName;
    private final String SeasonDesc;

    //3.私有化类的构造器
    private Season2(String seasonName, String SeasonDesc){
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


}

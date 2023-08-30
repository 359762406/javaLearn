package com.qihang03.stream.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: PersonStreamTest
 * Package: com.qihang03.stream.exer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 15:17
 * @Version 1.0
 */
public class PersonStreamTest {
    public static void main(String[] args) {

        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        Stream<String> streamOne = one.stream().filter(S -> S.length() == 3).limit(3);
        Stream<String> streamTwo = two.stream().filter(S -> S.substring(0,1).equals("张")).limit(3);
        Stream<String> streamTwo1 = two.stream().filter(S -> S.startsWith("张")).limit(3);

        Stream.concat(streamOne, streamTwo).map(Person::new).forEach(System.out::println);

    }
}

package com.qihang06.collections.exer1;

import java.util.*;

/**
 * ClassName: PokerTestWithHashMap
 * Package: com.qihang06.collections.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 15:58
 * @Version 1.0
 */
public class PokerTestWithHashMap {
    public static void main(String[] args) {
        String[] num = {"A", "2","3","4","5","6","7","8","9","10","J", "Q","K"};
        String[] color = {"方片","梅花","红桃","黑桃"};
        HashMap indexWithPoker = new HashMap();
        ArrayList poker = new ArrayList();
        int index = 0;
        for (int i = 0; i < color.length; i ++){
            for (int j = 0; j < num.length; j++) {
                indexWithPoker.put(index, color[i] + "" + num[j]);
                poker.add(index);
                index ++;
            }
        }
        poker.add(index);
        indexWithPoker.put(index++, "小王");
        poker.add(index);
        indexWithPoker.put(index++, "大王");

        System.out.println(indexWithPoker);
        System.out.println(poker);
        Collections.shuffle(poker);
        // 发牌
        //TreeSet自动排序
        TreeSet Tom = new TreeSet();
        TreeSet Jerry = new TreeSet();
        TreeSet me = new TreeSet();
        TreeSet lastCards = new TreeSet();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i)); // 将list集合中的索引添加到TreeSet集合中会自动排序
            } else if (i % 3 == 0) {
                Tom.add(poker.get(i));
            } else if (i % 3 == 1) {
                Jerry.add(poker.get(i));
            } else if (i % 3 == 2){
                me.add(poker.get(i));
            }
        }
        // 看牌
        lookPoker("Tom", Tom, indexWithPoker);
        lookPoker("Jerry", Jerry, indexWithPoker);
        lookPoker("康师傅", me, indexWithPoker);
        lookPoker("底牌", lastCards, indexWithPoker);
    }
    public static void lookPoker(String name, TreeSet playerName, HashMap indexWithPoker){
        System.out.println(name + "的牌是：");
        for (Object index : playerName){
            System.out.print(indexWithPoker.get(index) + " ");
        }
        System.out.println();
        Iterator iterator = playerName.iterator();
        while(iterator.hasNext()){
            System.out.print(indexWithPoker.get(iterator.next()) + " ");
        }
        System.out.println();
    }
}

package com.qihang06.collections.exer1;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: PokerTest
 * Package: com.qihang06.collections.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 10:20
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {
        //创建扑克牌
        String[] num = {"A", "2","3","4","5","6","7","8","9","10","J", "Q","K"};
        String[] color = {"方片","梅花","红桃","黑桃"};
        ArrayList poker = new ArrayList();
        for (int i = 0;i < color.length; i ++){
            for (int j = 0; j < num.length; j ++){
                poker.add(color[i] + num[j]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        System.out.println(poker);
        //洗牌
        Collections.shuffle(poker);
        //发牌
        ArrayList tom1 = new ArrayList();
        ArrayList tom2 = new ArrayList();
        ArrayList tom3 = new ArrayList();
        ArrayList lastCards = new ArrayList();
        for (int i = 0; i < poker.size(); i ++){
            if (i >= poker.size() - 3){
                lastCards.add(poker.get(i));
            }else if (i % 3 == 0){
                tom1.add(poker.get(i));
            }else if (i % 3 == 1){
                tom2.add(poker.get(i));
            }else if (i % 3 == 2){
                tom3.add(poker.get(i));
            }
        }
    }
    @Test
    public void test(){
        
    }
    
}

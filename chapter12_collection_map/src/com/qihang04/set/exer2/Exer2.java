package com.qihang04.set.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: Exer2
 * Package: com.qihang04.set.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 11:07
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        while (set.size() < 10){
            int random = (int)(Math.random() * (10 - 1 + 1) + 1);
            set.add(random);
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

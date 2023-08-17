package com.qihang01.use.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Package: com.qihang01.use.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:49
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * (99 - 0 + 1)));
        }
        for(Integer integer : list){
            System.out.println(integer);
        }
        System.out.println();
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }


}

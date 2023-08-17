package com.qihang01.use;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Package: com.qihang01.use
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 17:34
 * @Version 1.0
 */
public class CollectionMapTest {
    @Test
    public void test1(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(233);
        list.add(233);
        list.add(233);
        //类型不安全，add()是Object类型
//        list.add("a");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            //需要使用强转操作，繁琐。还有可能导致ClassCastException异常。
            Integer i = (Integer) iterator.next();
            int score = i;
            System.out.println(score);
        }
    }
    @Test
    public void test2(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("123",456);
        map.put("da",456);
        map.put("weq",456);
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        var entries = map.entrySet();
        var iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "--->" + value);
        }
    }


}

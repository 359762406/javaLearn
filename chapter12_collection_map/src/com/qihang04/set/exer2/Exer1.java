package com.qihang04.set.exer2;

import java.util.*;

/**
 * ClassName: Exer1
 * Package: com.qihang04.set.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 10:57
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(12);
        list.add(23);
        list.add(32);
        list.add(32);
        list.add(23);
        List newList = duplicateList(list);
        System.out.println(newList);
    }
    public static List duplicateList(List list){
//        HashSet set = new HashSet();
//        for(Object obj:list){
//            set.add(obj);
//        }
//        List list1 = new ArrayList();
//        for (Object obj : set){
//            list1.add(obj);
//        }
//        return list1;
        HashSet set = new HashSet(list);
        List list1 = new ArrayList(set);
        return list1;
    }
}

package com.qihang06.collections;

import org.junit.Test;

import java.lang.constant.Constable;
import java.util.*;

/**
 * ClassName: CollectionsTest
 * Package: com.qihang06.collections
 * Description:
 * collection:集合框架中的用于存储一个一个元素的接口，又分为List和Set等子接口。
 * collections是一个操作Set、List 和Map等集合的工具类。
 * @Author 刘起航
 * @Create 2023/8/16 22:43
 * @Version 1.0
 */
public class CollectionsTest {
    /*
    *排序操作:
    - reverse(List):反转List中元素的顺序
    - shuffle(List):对 List集合元素进行随机排序
    - sort(List):根据元素的自然顺序对指定List集合元素按升序排序
    - sort(List，Comparator):根据指定的Comparator产生的顺序对List 集合元素进行排序- swap(List. int, int):将指定list集合中的i处元素和j处元素进行交换
    **/

    @Test
    public void test1(){
        List list = Arrays.asList(21,31,41,32,32,343,113,223);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -i1.compareTo(i2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);
        Collections.swap(list, 1, 2);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.binarySearch(list, 41, (Comparator<Object>) (o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return -i1.compareTo(i2);
            }
            throw new RuntimeException("类型不匹配");
        }));
        System.out.println(list);
    }
    @Test
    public void test2(){
        List list1 = new ArrayList();
        list1.add(23);
        list1.add(12);
        list1.add(123);
        List list2 = Collections.unmodifiableList(list1); // list2只能读不能写
        System.out.println(list2.get(1));
    }
    @Test
    public void test3(){
        List list1 = new ArrayList();
        List list2 = Collections.synchronizedList(list1);
        HashMap map1 = new HashMap();
        HashMap map2 = (HashMap) Collections.synchronizedMap(map1);
    }


    
}

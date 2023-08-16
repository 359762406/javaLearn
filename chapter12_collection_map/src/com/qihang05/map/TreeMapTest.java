package com.qihang05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * ClassName: TreeMap
 * Package: com.qihang05.map
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 17:51
 * @Version 1.0
 */
public class TreeMapTest {
    /*
     * TreeMap:底层使用红黑树存储;可以按照添加的key-value中的key元素的指定的属性的大小顺序进行遍历。
     * 需要考虑使用◎自然排序②定制排序。
     * 要求:向TreeMap中添加的key必须是同一个类型的对象。
     * */
    @Test
    public void test1(){
        TreeMap map = new TreeMap();
        map.put("aa", 12);
        map.put("dd", 32);
        map.put("yy", 123);
        map.put("rr", 32);
//        map.put(23,31); //ClassCastException  key的类型为Integer与之前的String类型不一致
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
    }
    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println("Comparator...");
                if (o1 == o2){
                    return 0;
                }
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    int value = p1.getName().compareTo(p2.getName());
                    if (value != 0){
                        return value;
                    }else {
                        return -(p1.getAge() - p2.getAge());
                    }
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        TreeMap map = new TreeMap(comparator);
        Person p1 = new Person(1231, "das");
        Person p2 = new Person(12131, "das");
        Person p3 = new Person(1231, "aas");
        Person p4 = new Person(131, "df");
        Person p5 = new Person(11, "dadas");
        map.put(p1, 21);
        map.put(p2, 231);
        map.put(p3, 23);
        map.put(p4, 313);
        map.put(p5, 21);
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
        Person p6 = new Person(11, "maria");
        System.out.println(map.containsKey(p6)); // 调用compareTo来判断是否相同
    }


}

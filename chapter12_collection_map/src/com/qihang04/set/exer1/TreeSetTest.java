package com.qihang04.set.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeSet;

/**
 * ClassName: TreeSetTest
 * Package: com.qihang04.set.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/16 10:27
 * @Version 1.0
 */
public class TreeSetTest {
    @Test
    public void test1(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println("comparator...");
                if (o1 == o2){
                    return 0;
                }
                if (o1 instanceof Person && o2 instanceof Person){
                    Person person1 = (Person) o1;
                    Person person2 = (Person) o2;
                    int value = person1.getAge() - person2.getAge();
                    if (value != 0){
                        return value;
                    }else {
                        return person1.getName().compareTo(person2.getName());

                    }
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeSet set = new TreeSet(comparator);
        Person p1 = new Person(1231, "das");
        Person p2 = new Person(12131, "das");
        Person p3 = new Person(1231, "aas");
        Person p4 = new Person(131, "df");
        Person p5 = new Person(11, "dadas");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}

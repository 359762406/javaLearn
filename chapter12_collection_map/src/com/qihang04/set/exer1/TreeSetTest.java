package com.qihang04.set.exer1;

import com.qihang05.map.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
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
    /*
    * TreeSet 是 SortedSet 接口的实现类，
    * TreeSet 可以按照添加的元素的指定的属性的大小顺序进行遍历。
    TreeSet底层使用红黑树结构存储数据*/
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
    /*
    * TreeSet特点：不允许重复、实现排序（自然排序或定制排序）
    TreeSet 两种排序方法：自然排序和定制排序。默认情况下，TreeSet 采用自然排序。
    自然排序：TreeSet 会调用集合元素的 compareTo(Object obj) 方法来比较元素之间的大小关系，然后将集合元素按升序(默认情况)排列。
    如果试图把一个对象添加到 TreeSet 时，则该对象的类必须实现 Comparable 接口。
    实现 Comparable 的类必须实现 compareTo(Object obj) 方法，两个对象即通过 compareTo(Object obj) 方法的返回值来比较大小。
    定制排序：如果元素所属的类没有实现Comparable接口，或不希望按照升序(默认情况)的方式排列元素或希望按照其它属性大小进行排序，则考虑使用定制排序。定制排序，
    *   通过Comparator接口来实现。需要重写compare(T o1,T o2)方法。
    利用int compare(T o1,T o2)方法，比较o1和o2的大小：如果方法返回正整数，则表示o1大于o2；如果返回0，表示相等；返回负整数，表示o1小于o2。
    要实现定制排序，需要将实现Comparator接口的实例作为形参传递给TreeSet的构造器。
    因为只有相同类的两个实例才会比较大小，所以向 TreeSet 中添加的应该是同一个类的对象。
    对于 TreeSet 集合而言，它判断两个对象是否相等的唯一标准是：两个对象通过 compareTo(Object obj) 或compare(Object o1,Object o2)方法比较返回值。返回值为0，则认为两个对象相等。
    * */

}

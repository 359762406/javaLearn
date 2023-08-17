package com.qihang01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.qihang01.use.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:21
 * @Version 1.0
 */
public class EmployeeTest {
    @Test
    public void test1(){
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                int yearDistance = o1.getMyDate().getYear() - o2.getMyDate().getYear();
//                if (yearDistance != 0){
//                    return yearDistance;
//                }else {
//                    int mouthDistance  = o1.getMyDate().getMouth() - o2.getMyDate().getMouth();
//                    if(mouthDistance != 0){
//                        return mouthDistance;
//                    }else {
//                        int dayDistance  = o1.getMyDate().getDay() - o2.getMyDate().getDay();
//                        return dayDistance;
//                    }
//                }
                return  o1.getMyDate().compareTo(o2.getMyDate());
            }
        };
        TreeSet<Employee> treeSet = new TreeSet<>(employeeComparator);
        Employee e1 = new Employee("adad", 12, new MyDate(122,21,213));
        Employee e2 = new Employee("da", 213, new MyDate(22,21,213));
        Employee e3 = new Employee("eq", 2213, new MyDate(233,211,2113));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.toArray();
        Iterator<Employee> iterator = treeSet.iterator();
        for (Iterator<Employee> it = iterator; it.hasNext(); ) {
            Employee employee = it.next();
            System.out.println(employee);
        }
    }
    
}

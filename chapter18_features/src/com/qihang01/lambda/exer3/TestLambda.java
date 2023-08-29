package com.qihang01.lambda.exer3;

import com.qihang01.lambda.exer3.Employee;

import java.util.HashMap;

/**
 * ClassName: TestLambda
 * Package: com.qihang01.lambda.exer3
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:30
 * @Version 1.0
 */
public class TestLambda {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
        Employee e1 = new Employee(1, "张三", 8000);
        Employee e2 = new Employee(2, "李四", 9000);
        Employee e3 = new Employee(3, "王五", 10000);
        Employee e4 = new Employee(4, "赵六", 11000);
        Employee e5 = new Employee(5, "钱七", 12000);

        map.put(e1.getId(), e1);
        map.put(e2.getId(), e2);
        map.put(e3.getId(), e3);
        map.put(e4.getId(), e4);
        map.put(e5.getId(), e5);
        map.forEach((k,v) -> System.out.println(k+"="+v));
        System.out.println();
        map.replaceAll((k, v) ->{
            if(v.getSalary() < 10000){
                v.setSalary(10000);
            }
            return v;
        });
        map.forEach((k,v) -> System.out.println(k+"="+v));
    }
}

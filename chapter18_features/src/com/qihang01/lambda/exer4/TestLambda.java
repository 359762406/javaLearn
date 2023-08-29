package com.qihang01.lambda.exer4;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName: TestLambda
 * Package: com.qihang01.lambda.exer4
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:47
 * @Version 1.0
 */
public class TestLambda {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("ok");
        list.add("yes");

        list.forEach(str->System.out.println(str));
        System.out.println();

        list.removeIf(str->str.length()<5);
        list.forEach(str->System.out.println(str));
    }
    @Test
    public void test1(){
        EmployeeService es = new EmployeeService();

        es.get(e -> true).forEach(e->System.out.println(e));
        System.out.println();
        es.get(e -> e.getAge()>35).forEach(e->System.out.println(e));
        System.out.println();
        es.get(e -> e.getSalary()>15000 && e.getGender()=='女').forEach(e->System.out.println(e));
        System.out.println();
        es.get(e -> e.getId()%2==0).forEach(e->System.out.println(e));
        System.out.println();
        es.get(e -> "张三".equals(e.getName())).forEach(e->System.out.println(e));
        System.out.println();
        es.get(e -> e.getAge()>25 && e.getSalary()<10000 && e.getGender()=='男').forEach(e->System.out.println(e));
    }
    
}

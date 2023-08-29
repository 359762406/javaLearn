package com.qihang02.reference.data;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * ClassName: EmployeeData
 * Package: com.qihang02.reference.data
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 11:37
 * @Version 1.0
 */
public class EmployeeData {
    @Test
    public void test(){
        Employee emp = new Employee(1001, "tom", 23,2e5);
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };
        System.out.println(supplier.get());
        Supplier<String> supplier1 = () -> emp.getName();
        Supplier<String> supplier2 = emp::getName;
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

    }



}

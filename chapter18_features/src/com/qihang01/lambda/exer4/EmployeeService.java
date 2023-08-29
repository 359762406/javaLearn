package com.qihang01.lambda.exer4;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * ClassName: EmployeeService
 * Package: com.qihang01.lambda.exer4
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:53
 * @Version 1.0
 */
public class EmployeeService {
    private ArrayList<Employee> all;
    public EmployeeService(){
        all = new ArrayList<Employee>();
        all.add(new Employee(1, "张三", '男', 33, 8000));
        all.add(new Employee(2, "翠花", '女', 23, 18000));
        all.add(new Employee(3, "无能", '男', 46, 8000));
        all.add(new Employee(4, "李四", '女', 23, 9000));
        all.add(new Employee(5, "老王", '男', 23, 15000));
        all.add(new Employee(6, "大嘴", '男', 23, 11000));
    }
    public ArrayList<Employee> get(Predicate<Employee> p){
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Employee emp : result) {
            if(p.test(emp)){
                result.add(emp);
            }
        }
        return result;
    }
}

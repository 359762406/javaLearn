package com.qihang03._throws_throw.exer3.junit;

import com.qihang03._throws_throw.exer3.domain.Employee;
import com.qihang03._throws_throw.exer3.service.NameListService;
import com.qihang03._throws_throw.exer3.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListTest
 * Package: com.qihang03._throws_throw.exer3.junit
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:10
 * @Version 1.0
 */
public class NameListTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee() {
            int i = 20;
        while(i >= 1){
            try {
                NameListService nameListService = new NameListService();
                Employee employee = nameListService.getEmployee(i);
                System.out.println(employee);
            }catch (TeamException e){
                System.out.println(e.getMessage());
            }
            i --;
        }
    }

    
}

package com.qihang03.field_method.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.qihang03.field_method.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/14 15:36
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.birthday = new MyDate();
        p1.birthday.day = 12;
        p1.birthday.mouth = 4;
        p1.birthday.year = 2000;

        p1.name  = "qihang";
        p1.name = new String("qiahng");
        p1.age = 23;
        p1.salary = 2333;
        p1.id = 10001;
    }

}

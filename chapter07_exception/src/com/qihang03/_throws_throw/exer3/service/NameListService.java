package com.qihang03._throws_throw.exer3.service;

import com.qihang03._throws_throw.exer3.domain.*;

/**
 * ClassName: NameListSerive
 * Package: com.qihang03._throws_throw.exer3.service
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:06
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //获取通用的属性
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            String name = Data.EMPLOYEES[i][2];
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            switch (type) {
                case Data.EMPLOYEE -> employees[i] = new Employee(id, name, age, salary);
                case Data.PROGRAMMER -> employees[i] = new Programmer(id, name, age, salary, this.createEquipment(i));

                case Data.DESIGNER -> employees[i] = new Designer(id, name, age, salary,this.createEquipment(i),
                        Double.parseDouble(Data.EMPLOYEES[i][5]));
                case Data.ARCHITECT -> employees[i] = new Architect(id, name, age, salary,this.createEquipment(i),
                        Double.parseDouble(Data.EMPLOYEES[i][5]), Integer.parseInt(Data.EMPLOYEES[i][6]));
            }

        }
    }
    private Equipment createEquipment(int index){
        int equipmentType = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        String model = Data.EQUIPMENTS[index][1];
        String display = Data.EQUIPMENTS[index][2];
        switch (equipmentType){
            case Data.PC -> {
                return new PC(model, display);
            }
            case Data.NOTEBOOK -> {
                double price = Double.parseDouble(display);
                return new Notebook(model, price);
            }
            case Data.PRINTER -> {
                return new Printer(model, display);
            }
        }
        return null;
    }

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}

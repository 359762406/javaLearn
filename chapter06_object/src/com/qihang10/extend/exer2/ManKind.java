package com.qihang10.extend.exer2;

/**
 * ClassName: ManKind
 * Package: com.qihang10.extend.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:32
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1){
            System.out.println("Man");
        }else{
            System.out.println("Woman");
        }
    }
    public void employee(){
        if (salary <= 0){
            System.out.println("no job");
        }else{
            System.out.println("有工作");
        }
    }
}

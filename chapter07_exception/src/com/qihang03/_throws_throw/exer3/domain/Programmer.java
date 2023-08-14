package com.qihang03._throws_throw.exer3.domain;

import com.qihang03._throws_throw.exer3.service.Status;

/**
 * ClassName: Programmer
 * Package: com.qihang03._throws_throw.exer3.domain
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:10
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId; //加入开发团队后团队中的ID
    private Status status = Status.FREE; // 表示成员的状态
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getDetails(){
        return super.getDetails();
    }
    @Override
    public String toString() {
        return this.getDetails() + "\t程序员" + "\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }
    protected String getBasicDetailForTeam(){
        return getMemberId() + "/" + getId() + "\t" + getName()+ "\t" + getAge() + "\t" + getSalary();
    }
    public String getDetailsForTeam(){
         return getBasicDetailForTeam()+ "\t程序员";
    }
}

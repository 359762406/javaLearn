package com.qihang03._throws_throw.exer3.domain;

/**
 * ClassName: Designer
 * Package: com.qihang03._throws_throw.exer3.domain
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:09
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

//    protected String getDetails(){
//        return super.getDetails();
//    }
//    public  Equipment getEquipment(){
//        return super.getEquipment();
//    }

    @Override
    public String toString() {
        return this.getDetails() + "\t设计师" + "\t" + getStatus() + "\t" + getBonus() + "\t\t\t" +
                getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getBasicDetailForTeam() + "\t设计师" + "\t" + getBonus();
    }
}

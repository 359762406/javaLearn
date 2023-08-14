package com.qihang03._throws_throw.exer3.domain;

/**
 * ClassName: Architect
 * Package: com.qihang03._throws_throw.exer3.domain
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:08
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int stock) {
        this.stock = stock;
    }

    public Architect(double bonus, int stock) {
        super(bonus);
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return this.getDetails() + "\t架构师" + "\t" + getStatus() + "\t" + getBonus() + "\t" + getStock() + "\t" +
                getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getBasicDetailForTeam() + "\t架构师" + "\t" + getBonus() + "\t" + getStock();
    }
}

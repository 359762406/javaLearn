package com.qihang10.extend.exer2;

/**
 * ClassName: Kids
 * Package: com.qihang10.extend.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/18 21:41
 * @Version 1.0
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}

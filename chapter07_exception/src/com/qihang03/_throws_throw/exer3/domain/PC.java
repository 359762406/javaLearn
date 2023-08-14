package com.qihang03._throws_throw.exer3.domain;

/**
 * ClassName: PC
 * Package: com.qihang03._throws_throw.exer3.domain
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:10
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;  // 型号
    private String display;  //显示器持续混

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}

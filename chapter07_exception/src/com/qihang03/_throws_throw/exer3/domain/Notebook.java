package com.qihang03._throws_throw.exer3.domain;

/**
 * ClassName: Notebook
 * Package: com.qihang03._throws_throw.exer3.domain
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:09
 * @Version 1.0
 */
public class Notebook implements Equipment{
    private String model;
    private double price;

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Notebook() {
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

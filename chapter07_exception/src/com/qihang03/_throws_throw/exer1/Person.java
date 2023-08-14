package com.qihang03._throws_throw.exer1;

/**
 * ClassName: Person
 * Package: com.qihang03._throws_throw.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/26 15:53
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        this.setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {

            return lifeValue;

    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue >= 0 ){
            this.lifeValue = lifeValue;

        }else{
            throw new NoLifeValueException("生命值不能为负数: " + lifeValue);
        }
    }


}

package com.qihang03._throws_throw.exer1;

/**
 * ClassName: PersonTest
 * Package: com.qihang03._throws_throw.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/26 17:07
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        try{
            Person p1 = new Person("123", -1);

        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }finally {
            Person p2 = new Person();
            try{
                p2.setLifeValue(-10);

            }catch (NoLifeValueException e1){
                System.out.println(e1.getMessage());
            }finally {
                p2.setLifeValue(10);
                System.out.println(p2.getLifeValue());
            }
        }
    }
}

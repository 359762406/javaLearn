package com.qihang19._abstract.template;

/**
 * ClassName: TemplateTest
 * Package: com.qihang19._abstract.template
 * Description:
 *  抽象类的应用  模板方法的设计模式
 * @Author 刘起航
 * @Create 2023/7/21 16:31
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p = new PrintPrimeNumber();
        p.spendTime();
    }
}
abstract class  Template{
    public void spendTime(){
        long startTime = System.currentTimeMillis();
        this.code();
        long endTime = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (endTime - startTime));
    }
    public abstract void code();
}

class PrintPrimeNumber extends Template{

    @Override
    public void code() {
        for (int i = 2; i <= 100000; i ++){
            boolean isFlag = true;
            for(int j = 2; j <= Math.sqrt(i); j ++ ){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}

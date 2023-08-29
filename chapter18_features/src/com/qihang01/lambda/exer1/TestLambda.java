package com.qihang01.lambda.exer1;

/**
 * ClassName: TestLambda
 * Package: com.qihang01.lambda.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/29 10:12
 * @Version 1.0
 */
//无参无返回值形式
public class TestLambda {
    public static void main(String[] args) {
        callSomething(new Call() {
            @Override
            public void shout() {
                System.out.println("吃饭");
            }
        });
        callSomething(() ->
            System.out.println("吃饭")
        );
    }
    public static void callSomething(Call call){
        call.shout();
    }
}
interface Call {
    void shout();
}
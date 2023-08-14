package com.qihang18._final.exer1;

public final class Test {
    public static int totalNumber = 5;
    public final int ID;

    public Test() {
        ID = ++totalNumber; // 可在构造器中给final修饰的“变量”赋值
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.ID);
        System.out.println(Test.totalNumber);
    }
}

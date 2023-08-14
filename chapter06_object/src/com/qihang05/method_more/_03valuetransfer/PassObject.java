package com.qihang05.method_more._03valuetransfer;

/**
 * ClassName: passObject
 * Package: com.qihang05.method_more._03valuetransfer
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 17:40
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle cir = new Circle();
        passObject.printAreas(cir, 7); //引用数据类型传入地址
        System.out.println(cir.radius);
    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        int i = 0;
        while(i <= time){
            i ++;
            c.radius = i;
            System.out.println(i + "\t\t\t" + c.findArea());
        }

    }
}

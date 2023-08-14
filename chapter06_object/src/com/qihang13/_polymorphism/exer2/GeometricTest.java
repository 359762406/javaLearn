package com.qihang13._polymorphism.exer2;

/**
 * ClassName: GeometricTest
 * Package: com.qihang13._polymorphism.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/19 17:05
 * @Version 1.0
 */
public class GeometricTest {
    /**
     * 比较图形的面积是否相同
     * @param g1 图形1
     * @param g2 图形2
     * @return  true:相同返回 false:不同返回
     */
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();

    }

    /**
     * 显示几何图形的面积
     * @param g1
     */
    public void displayGeometricObject(GeometricObject g1){ //GeometricObject g1 == new Circle("red", 1.0, 2.3);
        System.out.println("几何图形的面积为" + g1.findArea());
        //动态绑定（编译和运行时的方法不是一个）   静态绑定（编译和运行的方法为同一个）
    }
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 2.3);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle("red", 1.0, 4.3);
        test.displayGeometricObject(c2);
        System.out.println(test.equalsArea(c1, c2));
        test.displayGeometricObject(new MyRectangle("green", 1.2,3.4,5.6)); //使用匿名对象
    }
}

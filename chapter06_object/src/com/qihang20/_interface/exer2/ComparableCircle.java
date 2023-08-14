package com.qihang20._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.qihang20._interface.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:14
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
    //根据对象的半径的大小，比较对象的大小
    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        if (o instanceof ComparableCircle){
            ComparableCircle c1 = new ComparableCircle();
            return  Double.compare(this.getRadius(), c1.getRadius());
            /*
             if (d1 < d2)
                return -1;           // Neither val is NaN, thisVal is smaller
             if (d1 > d2)
                return 1;            // Neither val is NaN, thisVal is larger
            * */
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}

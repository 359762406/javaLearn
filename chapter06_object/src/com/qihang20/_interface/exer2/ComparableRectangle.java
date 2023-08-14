package com.qihang20._interface.exer2;

/**
 * ClassName: ComparableRectangle
 * Package: com.qihang20._interface.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/22 15:36
 * @Version 1.0
 */
public class ComparableRectangle extends Rectangle implements CompareObject {
    public ComparableRectangle(double height, double width) {
        super(height, width);
    }

    public ComparableRectangle() {
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        if (o instanceof ComparableRectangle rectangle){
            return Double.compare(this.findArea(), rectangle.findArea());
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}

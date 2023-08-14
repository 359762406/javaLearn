package com.qihang14.object.euqals.exer2;

import java.util.Objects;

/**
 * ClassName: Account
 * Package: com.qihang14.object.exer2
 * Description:
 * 3. equals()的使用
 *  *  任何数据类型都可以调用，检查两个对象的地址值是否相同
 *  *  子类使用说明：
 *  *  >自定义的类在没有重写Object中equals()方法的情况下，调用的就是Object类中声明的equals()，比较两个对象的引用地址是否相同。
 *  *  （或比较两个对象是否指向了堆空间中的同一个对象实体)
 *  *  >对于像String、File、Date和包装类等，它们都重写了Object类中的equals()方法，用于比较两个对象的实体内容是否相等。
 *  *  >实际开发中，针对于自定义的类，常常会判断两个对象是否equals()，而此时主要是判断两个对象的属性值是否相等。
 *  *   所以:我们要重写Object类的equals()方法。
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:07
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }


}

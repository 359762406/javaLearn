package com.qihang01.string;

/**
 *public final class String
 *     implements java.io.Serializable, Comparable<String>, CharSequence,
 *                Constable, ConstantDesc
 *  final :String不可被继承
 *  Serializable：可序列化的接口。凡是实现此接口的类的对象就可以通过网络或本地流进行数据的传输。
 *  Constable：:凡是实现此接口的类。其对象都可以比较大小。
 *
 * private final byte[] value;
 *  final 一旦value数组初始化，其地址无法更改 char->byte 优化空间
 * 位置： 字符串常量存储再字符串常量池中， 相同的字符串地址相同
 * 2．字符串常量的存储位置
 *  字符串常量都存储在字符串常量池(StringTable)中
 *  字符串常量池不允许存放两个相同的字符串常量。
 *  字符串常量池，在不同的jdk版本中，存放位置不同。
 *   jdk7之前。字符串常量池存放在方法区  jdk7及之后。字符串常量池存放在堆空间。
 *
 *String的不可变性
 * 当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改
 * 当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有的位置修阈
 *
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";  //
        String s2 = "hello";  // 存放
        System.out.println(s1 == s2);
        s2 = "hi" + "123";
        System.out.println(s2);
        System.out.println(s1);
        s1.replace('l', 'w');
    }
}

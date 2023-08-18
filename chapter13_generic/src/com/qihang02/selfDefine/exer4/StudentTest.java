package com.qihang02.selfDefine.exer4;

/**
 * ClassName: StudentTest
 * Package: com.qihang02.selfDefine.exer4
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/18 16:24
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("tom", "良好");
        Student<Integer> s2 = new Student<>("jerry", 90);
        Student<Character> s3 = new Student<>("Rose", 'A');

    }
}

package com.qihang04.example.obarr;

/**
 * ClassName: studentTest
 * Package: com.qihang04.example.obarr
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 14:59
 * @Version 1.0
 */
public class studentTest {

    public static void main(String[] args) {
        //创建student[]
        student[] stu = new student[20];
        studentUtil util = new studentUtil();
        for (int i = 0; i < stu.length ; i ++ ){
            stu[i] = new student();
            stu[i].id = i;
            stu[i].score = (int)(Math.random() * 101);
            stu[i].state = (int)(Math.random() * 6 + 1);
        }
        util.stuShowAll(stu);

        System.out.println();

        util.quickSort(stu, 0, stu.length - 1);

        util.stuShowAll(stu);

        student stu1 = util.findMax(stu);
        System.out.println(stu1.id + "\t" + stu1.state + "\t" + stu1.score);

        stu1 = util.findMin(stu);
        System.out.println(stu1.id + "\t" + stu1.state + "\t" + stu1.score);

        util.stuShowWithIndex(stu, 0);
    }





}

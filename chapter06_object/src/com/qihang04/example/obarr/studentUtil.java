package com.qihang04.example.obarr;

/**
 * ClassName: studentUtil
 * Package: com.qihang04.example.obarr
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/15 15:30
 * @Version 1.0
 */
public class studentUtil {
    public void quickSort(student[] stu, int begin, int end){
        if (begin >= end){
            return;
        }
        int lift = begin - 1, right = end + 1;
        int mid = stu[lift + right >> 1].score;
        while (lift < right){
            while(stu[++ lift].score > mid){
                continue;
            }
            while(stu[-- right].score < mid){
                continue;
            }
            if (lift < right){
                stuSwap(stu, lift, right);
            }
        }
        quickSort(stu, begin, right);
        quickSort(stu, right + 1, end);

    }
    public void stuShowAll(student[] stu){
        for (com.qihang04.example.obarr.student student : stu) {
            System.out.println("id is " + student.id + " state is " + student.state + " score is " + student.score);
        }
    }
    public void stuShowWithIndex(student[] stu, int index){


        System.out.println("id is " + stu[index].id + " state is " + stu[index].state + " score is " + stu[index].score);

    }
    public student findMax(student[] stu){

        student stu1 = stu[0];
        for (com.qihang04.example.obarr.student student : stu) {
            if (student.score > stu1.score) {
                stu1 = student;
            }


        }
        return stu1;
    }
    public student findMin(student[] stu){

        student stu1 = stu[0];
        for (com.qihang04.example.obarr.student student : stu) {
            if (student.score < stu1.score) {
                stu1 = student;
            }


        }
        return stu1;
    }
    public void stuSwap(student[] stu, int lift, int right){
        student st1 = stu[lift];
        stu[lift]  = stu[right];
        stu[right] = st1;
    }
}

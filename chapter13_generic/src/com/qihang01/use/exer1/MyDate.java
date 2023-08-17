package com.qihang01.use.exer1;

import java.util.Objects;

/**
 * ClassName: MyDate
 * Package: com.qihang01.use.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/17 21:18
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    public int year;
    public int mouth;
    public int day;

    public MyDate() {
    }

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && mouth == myDate.mouth && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, mouth, day);
    }

    @Override
    public String toString() {
        return  year + "年"+
                mouth +"月" +
                day +"日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDistance = this.getYear() - o.getYear();
        if (yearDistance != 0){
            return yearDistance;
        }else {
            int mouthDistance  = this.getMouth() - o.getMouth();
            if(mouthDistance != 0){
                return mouthDistance;
            }else {
                int dayDistance  = this.getDay() - o.getDay();
                return dayDistance;
            }
        }
    }
}

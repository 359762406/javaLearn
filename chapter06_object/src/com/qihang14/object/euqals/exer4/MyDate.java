package com.qihang14.object.euqals.exer4;

import java.util.Objects;

/**
 * ClassName: MyDate
 * Package: com.qihang14.object.exer4
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/20 9:49
 * @Version 1.0
 */
public class MyDate {
    private int mouth;
    private int day;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int mouth, int year) {
        this.mouth = mouth;
        this.day = day;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return mouth == myDate.mouth && day == myDate.day && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouth, day, year);
    }
}

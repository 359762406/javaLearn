package com.qihang04.other.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

/**
 * ClassName: Column
 * Package: com.qihang04.other
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 11:57
 * @Version 1.0
 */
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnName();
    String columnType();
}

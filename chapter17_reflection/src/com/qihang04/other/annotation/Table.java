package com.qihang04.other.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: Table
 * Package: com.qihang04.other
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/28 11:49
 * @Version 1.0
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}

package com.qihang23.Annotation.exer1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Package: com.qihang23.Annotation.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/24 11:44
 * @Version 1.0
 */
@Target({TYPE, FIELD, ElementType.METHOD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "hello";
}

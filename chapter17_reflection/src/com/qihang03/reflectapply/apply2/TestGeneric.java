package com.qihang03.reflectapply.apply2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * ClassName: TestGeneric
 * Package: com.qihang03.reflectapply.apply2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/26 22:37
 * @Version 1.0
 */
/* Type：
 * （1）Class
 * （2）ParameterizedType
 * 		例如：Father<String,Integer>
 * 			ArrayList<String>
 * （3）TypeVariable
 * 		例如：T，U,E,K,V
 * （4）WildcardType
 * 		例如：
 * 		ArrayList<?>
 * 		ArrayList<? super 下限>
 * 		ArrayList<? extends 上限>
 * （5）GenericArrayType
 * 		例如：T[]
 *
 */
public class TestGeneric {
    public static void main(String[] args) {
        //需求：在运行时，获取Son类型的泛型父类的泛型实参<String,Integer>

        //（1）还是先获取Class对象
        Class clazz = Son.class;//四种形式任意一种都可以

        //（2）获取泛型父类
		Class sc = clazz.getSuperclass();
		System.out.println(sc);
        /*
         * getSuperclass()只能得到父类名，无法得到父类的泛型实参列表
         */
        //获取带泛型的父类
        Type type = clazz.getGenericSuperclass();

        // Father<String,Integer>属于ParameterizedType
        ParameterizedType pt = (ParameterizedType) type;

        //（3）获取泛型父类的泛型实参列表
        Type[] typeArray = pt.getActualTypeArguments();
        for (Type type2 : typeArray) {
            System.out.println(type2);
        }
    }
}
//泛型形参：<T,U>
class Father<T,U>{

}
//泛型实参：<String,Integer>
class Son extends Father<String,Integer>{

}

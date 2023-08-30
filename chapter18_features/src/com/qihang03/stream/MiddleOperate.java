package com.qihang03.stream;

/**
 * ClassName: MiddleOperate
 * Package: com.qihang03.stream
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 9:58
 * @Version 1.0
 */
public class MiddleOperate {
    /*
    多个中间操作可以连接起来形成一个流水线，除非流水线上触发终止操作，否则中间操作不会执行任何的处理！
        而在终止操作时一次性全部处理，称为“惰性求值”。
    * */
    /*
    * 1-筛选与切片
方 法	            描 述
filter(Predicatep)	接收 Lambda ， 从流中排除某些元素
distinct()	        筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
limit(long maxSize)	截断流，使其元素不超过给定数量
skip(long n)	    跳过元素，返回一个扔掉了前 n 个元素的流。
                    若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
    * */
    /*
    * 2-映 射
方法	                            描述
map(Function f)	                接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
mapToDouble(ToDoubleFunction f)	接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 DoubleStream。
mapToInt(ToIntFunction f)	    接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
mapToLong(ToLongFunction f)	    接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 LongStream。
flatMap(Function f)	            接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
    * */
    /*
    * 3-排序
方法	                     描述
sorted()	             产生一个新流，其中按自然顺序排序
sorted(Comparator com)	 产生一个新流，其中按比较器顺序排序
    * */

}

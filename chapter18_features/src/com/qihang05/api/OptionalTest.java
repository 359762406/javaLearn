package com.qihang05.api;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Package: com.qihang05.api
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 16:36
 * @Version 1.0
 */
public class OptionalTest {
    /*
    * JDK8的新特性

到目前为止，臭名昭著的空指针异常是导致Java应用程序失败的最常见原因。以前，为了解决空指针异常，Google在著名的Guava项目引入了Optional类，通过检查空值的方式避免空指针异常。受到Google的启发，Optional类已经成为Java 8类库的一部分。

Optional<T> 类(java.util.Optional) 是一个容器类，它可以保存类型T的值，代表这个值存在。或者仅仅保存null，表示这个值不存在。如果值存在，则isPresent()方法会返回true，调用get()方法会返回该对象。
    * */
    /*
    * Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
创建Optional类对象的方法：
    static Optional empty() ：用来创建一个空的Optional实例
    static Optional of(T value) ：用来创建一个Optional实例，value必须非空
    static <T> Optional<T> ofNullable(T value) ：用来创建一个Optional实例，value可能是空，也可能非空
判断Optional容器中是否包含对象：
    boolean isPresent() : 判断Optional容器中的值是否存在
    void ifPresent(Consumer<? super T> consumer) ：判断Optional容器中的值是否存在，如果存在，就对它进行Consumer指定的操作，如果不存在就不做
获取Optional容器的对象：
    T get(): 如果调用对象包含值，返回该值。否则抛异常。T get()与of(T value)配合使用
    T orElse(T other)：orElse(T other) 与ofNullable(T value)配合使用，如果Optional容器中非空，就返回所包装值，如果为空，就用orElse(T other)other指定的默认值（备胎）代替
    T orElseGet(Supplier<? extends T> other) ：如果Optional容器中非空，就返回所包装值，如果为空，就用Supplier接口的Lambda表达式提供的值代替
    T orElseThrow(Supplier<? extends X> exceptionSupplier) ：如果Optional容器中非空，就返回所包装值，如果为空，就抛出你指定的异常类型代替原来的NoSuchElementException
    *
    * */
    @Test
    public void test1(){
        String str = "hello";
        Optional<String> opt = Optional.of(str);
        System.out.println(opt);
    }
    @Test
    public void test2(){
        Optional<String> opt = Optional.empty();
        System.out.println(opt);
    }
    @Test
    public void test3(){
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt);
    }
    @Test
    public void test4(){
        String str = "hello";
        Optional<String> opt = Optional.of(str);

        String string = opt.get();
        System.out.println(string);
    }
    @Test
    public void test5(){
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
//		System.out.println(opt.get());//java.util.NoSuchElementException: No value present
    }
    @Test
    public void test6(){
        String str = "hello";
        Optional<String> opt = Optional.ofNullable(str);
        String string = opt.orElse("atguigu");
        System.out.println(string);
    }
    @Test
    public void test7(){
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        String string = opt.orElseGet(String::new);
        System.out.println(string);
    }
    @Test
    public void test8(){
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        String string = opt.orElseThrow(()->new RuntimeException("值不存在"));
        System.out.println(string);
    }
    @Test
    public void test9(){
        String str = "Hello1";
        Optional<String> opt = Optional.ofNullable(str);
        //判断是否是纯字母单词，如果是，转为大写，否则保持不变
        String result = opt.filter(s->s.matches("[a-zA-Z]+"))
                .map(s -> s.toUpperCase()).orElse(str);
        System.out.println(result);
    }
}

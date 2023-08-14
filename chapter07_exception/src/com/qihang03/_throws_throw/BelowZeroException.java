package com.qihang03._throws_throw;

/**
 * ClassName: BelowZeroException
 * Package: com.qihang03._throws_throw
 * Description:
 *如何自定义异常类
 * （1）要继承一个异常类型
 *      自定义一个编译时异常类型：自定义类继承java.lang.Exception。
 *      自定义一个运行时异常类型：自定义类继承java.lang.RuntimeException。
 * （2）建议大家提供至少两个构造器，一个是无参构造，一个是(String message)构造器。
 * （3）自定义异常需要提供serialVersionUID
 * 如何使用自定义异常类
 *  在具体的代码中，满足指定条件的情况下，需要手动的使用"throw +自定义异常类的对象"方式，将异常对象抛出。
 *  如果自定义异常类是非运行时异常，则必须考虑如何处理此异常类的对象。(具体的:1.try-catch-finally 2.throws)
 *
 * 为什么需要自定义异常类?
 *    我们其实更关心的是，通过异常的名称就能直接判断此异常出现的原因。尽然如此，我们就有必要在实际开发场景中，不满足我们指定的条件时，指明我们自己特有的异常类。通过此异常类的名称，就能判断出具体出现的问题。
 * @Author 刘起航
 * @Create 2023/7/26 15:22
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -338993124229948L;

    public BelowZeroException() {
    }
    public BelowZeroException(String name){
        super(name);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}

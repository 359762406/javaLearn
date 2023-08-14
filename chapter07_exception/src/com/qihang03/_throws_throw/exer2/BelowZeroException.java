package com.qihang03._throws_throw.exer2;

/**
 * ClassName: BelowZeroException
 * Package: com.qihang03._throws_throw.exer2
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/26 17:29
 * @Version 1.0
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -993124229948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}

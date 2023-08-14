package com.qihang03._throws_throw.exer1;

/**
 * ClassName: NoLifeValueException
 * Package: com.qihang03._throws_throw.exer1
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/26 15:52
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -70348966939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }
}

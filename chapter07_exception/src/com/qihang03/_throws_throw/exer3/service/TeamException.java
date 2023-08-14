package com.qihang03._throws_throw.exer3.service;

/**
 * ClassName: TeamException
 * Package: com.qihang03._throws_throw.exer3.service
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/7/27 10:07
 * @Version 1.0
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -4229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}

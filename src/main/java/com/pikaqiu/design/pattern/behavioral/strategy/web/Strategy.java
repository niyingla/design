package com.pikaqiu.design.pattern.behavioral.strategy.web;

/**
 * @program: design_pattern
 * @description: 策略接口
 * @author: xiaoye
 * @create: 2019-02-19 16:56
 **/
public interface Strategy {

    /**
     * 执行策略方法
     * @param num1
     * @param num2
     * @return
     */
     int doOperation(int num1, int num2);
}
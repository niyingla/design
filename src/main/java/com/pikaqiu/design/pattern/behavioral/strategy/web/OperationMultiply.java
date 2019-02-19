package com.pikaqiu.design.pattern.behavioral.strategy.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-19 16:57
 **/
public class OperationMultiply implements Strategy{
    /**
     * 具体执行策略方法
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
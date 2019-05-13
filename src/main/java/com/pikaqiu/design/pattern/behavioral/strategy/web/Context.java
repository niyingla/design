package com.pikaqiu.design.pattern.behavioral.strategy.web;

/**
 * @program: design_pattern
 * @description: 策略执行对象
 * @author: xiaoye
 * @create: 2019-02-19 16:58
 **/
public class Context {

    /**
     * 目标策略
     */
    private Strategy strategy;


    /**
     * 构造时就传入执行策略
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     *  策略执行方法
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

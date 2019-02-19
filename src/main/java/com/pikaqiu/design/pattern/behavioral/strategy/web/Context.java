package com.pikaqiu.design.pattern.behavioral.strategy.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-19 16:58
 **/
public class Context {
    private Strategy strategy;


    /**
     * 构造时就传入执行策略
     * @param strategy
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

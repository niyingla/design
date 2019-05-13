package com.pikaqiu.design.pattern.behavioral.strategy.web;

/**
 * 执行策略和执行目标 是分开的
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-02-19 16:58
 **/
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
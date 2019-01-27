package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 20:03
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("这是一个空策略");
    }
}

package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * 策略实践类
 * @author xiaoye
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}

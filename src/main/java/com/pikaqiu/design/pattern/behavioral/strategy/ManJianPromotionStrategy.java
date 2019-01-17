package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * @author xiaoye
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}

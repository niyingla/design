package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * 策略适用（调用）类
 * @author xiaoye
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}

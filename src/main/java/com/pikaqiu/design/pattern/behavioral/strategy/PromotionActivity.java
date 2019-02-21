package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * 策略适用（调用）类
 * @author xiaoye
 */
public class PromotionActivity {

    /**
     * 目标策略模式
     */
    private PromotionStrategy promotionStrategy;

    /**
     * 目标策略模式作为构造参数
     * @param promotionStrategy
     */
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行策略方法
     */
    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}

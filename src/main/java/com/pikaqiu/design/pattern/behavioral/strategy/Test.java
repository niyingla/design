package com.pikaqiu.design.pattern.behavioral.strategy;

/**
 * 策略模式
 * @author xiaoye
 */
public class Test {
/*
    public static void main(String[] args) {
        //创建策略调用类  传入对应的策略
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
*/

    public static void main(String[] args) {
        //创建策略调用类  传入对应的策略
        PromotionStrategy lijian = PromotionStrategyFactory.getPromotionStrategy("LIJIAN");
        PromotionActivity promotionActivity = new PromotionActivity(lijian);
        promotionActivity.executePromotionStrategy();
    }
}

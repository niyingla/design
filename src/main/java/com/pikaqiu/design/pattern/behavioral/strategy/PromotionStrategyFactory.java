package com.pikaqiu.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 20:05
 **/
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PromotionStrategyMap = new HashMap<String, PromotionStrategy>();
    static {
        PromotionStrategyMap.put("LIJIAN", new LiJianPromotionStrategy());
        PromotionStrategyMap.put("MANJIAN", new ManJianPromotionStrategy());
        PromotionStrategyMap.put("FANXIAN", new FanXianPromotionStrategy());

    }
    private PromotionStrategyFactory(){
    }

    public static PromotionStrategy getPromotionStrategy(String  promotionStrategyName){
        PromotionStrategy promotionStrategy = PromotionStrategyMap.get(promotionStrategyName);
        return promotionStrategy == null ? new EmptyPromotionStrategy() : promotionStrategy;

    }

}

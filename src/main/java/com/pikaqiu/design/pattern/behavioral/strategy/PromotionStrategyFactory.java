package com.pikaqiu.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类
 *
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 20:05
 **/
public class PromotionStrategyFactory {

    /**
     * 策略模式集合
     */
    private static Map<String, PromotionStrategy> PromotionStrategyMap = new HashMap<String, PromotionStrategy>();

    /**
     * 也可以适用类似享元模式 需要一个创建一个 然后加入map集合
     */
    static {
        PromotionStrategyMap.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PromotionStrategyMap.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        PromotionStrategyMap.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());

    }

    private PromotionStrategyFactory() {
    }

    /**
     * 根据常量名获取对应策略方法
     * @param promotionStrategyName
     * @return
     */
    public static PromotionStrategy getPromotionStrategy(String promotionStrategyName) {
        PromotionStrategy promotionStrategy = PromotionStrategyMap.get(promotionStrategyName);
        //不存在既定的策略 则返回空策略
        return promotionStrategy == null ? new EmptyPromotionStrategy() : promotionStrategy;

    }

    /**
     * 定义内部常量接口
     */
    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }

}

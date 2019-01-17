package com.pikaqiu.design.pattern.structural.facade;

/**
 * 积分支付服务
 * @author xiaoye
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}

package com.pikaqiu.design.pattern.structural.facade;

/**
 * 物流子系统
 * @author xiaoye
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}

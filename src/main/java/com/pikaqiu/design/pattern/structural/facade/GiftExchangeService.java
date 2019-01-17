package com.pikaqiu.design.pattern.structural.facade;

/**
 * 集成系统（外观类）
 * 子类操作 封装到外观类中 形成和外部的统一交互
 * 以后实现变化  不需要修改调用调用者 在外观类中修改即可
 * @author xiaoye
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    /**
     * 兑换礼物
     * @param pointsGift
     */
    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}

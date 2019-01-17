package com.pikaqiu.design.pattern.structural.facade;

/**
 * 资格子系统
 * @author xiaoye
 */
public class QualifyService {

    /**
     *  是否有资格
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}

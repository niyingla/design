package com.pikaqiu.design.pattern.structural.proxy;

/**
 * @author xiaoye
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}

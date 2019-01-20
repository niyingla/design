package com.pikaqiu.design.pattern.structural.proxy.dynamicproxy;

import com.pikaqiu.design.pattern.structural.proxy.IOrderService;
import com.pikaqiu.design.pattern.structural.proxy.Order;
import com.pikaqiu.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        //获取到被代理后的类实例
        IOrderService orderServiceDynamicProxy = (IOrderService)
                new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}

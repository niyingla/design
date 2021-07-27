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
        order.setUserId(1);
        //获取到被代理后的类实例（jdk代理）
        IOrderService orderServiceProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        //代理调用
        orderServiceProxy.saveOrder(order);

        //原生调用
        IOrderService orderService = new OrderServiceImpl();
        System.out.println("------------------------------");
        orderService.saveOrder(order);
    }
}

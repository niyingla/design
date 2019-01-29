package com.pikaqiu.design.pattern.behavioral.command.web;

import java.util.ArrayList;
import java.util.List;

/**
 *  命令调用类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:15
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 循环调用所有动作
     */
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
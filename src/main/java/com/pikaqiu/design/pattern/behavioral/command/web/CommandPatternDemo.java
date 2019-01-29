package com.pikaqiu.design.pattern.behavioral.command.web;

/**
 * 接受并执行命令类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:15
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {

        Stock abcStock = new Stock();
        //创建具体命令类
        BuyStock buyStockOrder = new BuyStock(abcStock);
        //创建具体命令类
        SellStock sellStockOrder = new SellStock(abcStock);

        //命令调用类
        Broker broker = new Broker();
        //加入具体执行动作
        broker.takeOrder(buyStockOrder);
        //加入具体执行动作
        broker.takeOrder(sellStockOrder);
        //调用动作
        broker.placeOrders();
    }
}

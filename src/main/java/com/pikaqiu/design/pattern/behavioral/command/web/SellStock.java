package com.pikaqiu.design.pattern.behavioral.command.web;

/**
 * 具体命令类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:14
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
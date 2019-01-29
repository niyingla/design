package com.pikaqiu.design.pattern.behavioral.command.web;

/**
 * 具体命令类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:13
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
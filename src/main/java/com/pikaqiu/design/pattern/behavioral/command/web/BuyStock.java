package com.pikaqiu.design.pattern.behavioral.command.web;

/**
 * 具体命令类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:13
 **/
public class BuyStock implements Order {
    /**
     * 请求类
     */
    private Stock abcStock;

    /**
     * 构造方法传入
     * @param abcStock
     */
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    /**
     * 命令动作
     */
    @Override
    public void execute() {
        //发起动作请求
        abcStock.buy();
    }
}
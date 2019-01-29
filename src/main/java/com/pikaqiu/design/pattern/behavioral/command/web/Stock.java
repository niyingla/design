package com.pikaqiu.design.pattern.behavioral.command.web;

/**
 * 请求类
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-29 10:13
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    /**
     * 购买 动作请求
     */
    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    /**
     * 销售 动作请求
     */
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
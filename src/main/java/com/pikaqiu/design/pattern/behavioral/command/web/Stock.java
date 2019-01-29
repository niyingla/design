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

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
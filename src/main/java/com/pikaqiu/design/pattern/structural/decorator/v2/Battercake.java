package com.pikaqiu.design.pattern.structural.decorator.v2;

/**
 * @author xiaoye
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

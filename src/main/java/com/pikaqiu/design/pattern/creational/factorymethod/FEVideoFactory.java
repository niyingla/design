package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * 实际工厂类
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}

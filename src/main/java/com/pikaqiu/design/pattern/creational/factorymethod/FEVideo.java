package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * 工厂实际产生的产品类
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}

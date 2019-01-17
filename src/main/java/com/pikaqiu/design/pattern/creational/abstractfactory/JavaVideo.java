package com.pikaqiu.design.pattern.creational.abstractfactory;

/**
 * @author xiaoye
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}

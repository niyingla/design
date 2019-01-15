package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * @author xiaoye
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}

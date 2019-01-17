package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * @author xiaoye
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}

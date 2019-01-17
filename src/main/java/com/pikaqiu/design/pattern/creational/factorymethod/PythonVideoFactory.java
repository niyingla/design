package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * @author xiaoye
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}

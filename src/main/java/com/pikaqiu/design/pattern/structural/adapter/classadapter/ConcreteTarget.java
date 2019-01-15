package com.pikaqiu.design.pattern.structural.adapter.classadapter;

/**
 * @author xiaoye
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}

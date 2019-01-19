package com.pikaqiu.design.pattern.structural.adapter.objectadapter;


/**
 * 需要适配的目标方法接口 直接实现
 * @author xiaoye
 */
public class  ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}

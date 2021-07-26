package com.pikaqiu.design.pattern.behavioral.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-28 00:01
 **/
public class GuavaEvent {

    /**
     * 调用观察方法
     * @Subscribe 这是观察方法的注解
     * @param str
     */
    @Subscribe
    public void postEvent(String str){
        if(1 ==1 ){
            throw new RuntimeException("");
        }
        System.out.println("观察者方法被调用内容是："+str);
    }
}

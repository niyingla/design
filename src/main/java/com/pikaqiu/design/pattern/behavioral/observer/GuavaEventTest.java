package com.pikaqiu.design.pattern.behavioral.observer;


import com.google.common.eventbus.EventBus;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-27 23:59
 **/
public class GuavaEventTest {

    public static void main(String[] args) {
        //事件检测对象
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent1 guavaEvent1 = new GuavaEvent1();

        //注册需要观察的对象的方法
        eventBus.register(guavaEvent);
        eventBus.register(guavaEvent1);

        //调用触发观察
        eventBus.post("post调用啊");
    }

}

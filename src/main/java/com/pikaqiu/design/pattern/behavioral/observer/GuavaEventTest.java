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
        //时间观察对象  @Subscribe指定事件方法
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent1 guavaEvent1 = new GuavaEvent1();

        System.out.println("开始注册事件");
        //注册需要观察的对象的方法
        eventBus.register(guavaEvent);
        eventBus.register(guavaEvent1);
        System.out.println("注册事件完毕");
        //调用触发观察 上报事件
        System.out.println("开始上报事件");
        eventBus.post("post调用啊");
        System.out.println("上报完毕事件");
    }

}

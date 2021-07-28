package com.pikaqiu.design.pattern.behavioral.observer;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2019-01-28 00:01
 **/
@Slf4j
public class GuavaEvent {

    /**
     * 调用观察方法
     * @Subscribe 这是观察方法的注解
     * @param str
     */
    @Subscribe
    public void postEvent(String str) {
        if (new Random().nextBoolean()) {
            throw new RuntimeException("报错啦");
        }
        log.info("观察者方法被调用内容是：" + str);
    }
}

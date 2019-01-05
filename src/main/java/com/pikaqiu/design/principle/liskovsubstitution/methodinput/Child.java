package com.pikaqiu.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * 子类入参 更宽松
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}

package com.pikaqiu.design.pattern.structural.adapter.objectadapter;

/**
 * 适配器类
 * @author xiaoye
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    /**
     * 实现相同接口 内容确实转换后的被适配方法
     */
    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}

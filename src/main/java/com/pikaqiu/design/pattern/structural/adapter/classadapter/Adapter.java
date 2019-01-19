package com.pikaqiu.design.pattern.structural.adapter.classadapter;

/**
 * @author xiaoye
 */
public class Adapter extends Adaptee implements Target{


    /**
     * 为target适配父类的方法
     */
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}

package com.pikaqiu.design.pattern.structural.adapter.classadapter;

/**
 * @author xiaoye
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}

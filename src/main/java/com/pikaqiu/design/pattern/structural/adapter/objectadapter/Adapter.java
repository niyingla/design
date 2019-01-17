package com.pikaqiu.design.pattern.structural.adapter.objectadapter;

/**
 * @author xiaoye
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}

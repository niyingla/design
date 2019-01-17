package com.pikaqiu.design.pattern.creational.prototype.abstractprototype;

/**
 * @author xiaoye
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

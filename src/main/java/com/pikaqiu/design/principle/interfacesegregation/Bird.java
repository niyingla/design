package com.pikaqiu.design.principle.interfacesegregation;

/**
 * 接口隔离原则
 *   客户端不应该依赖它不需要的接口；
 *   一个类对另一个类的依赖应该建立在最小的接口上。
 * @author xiaoye
 */
public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

package com.pikaqiu.design.principle.interfacesegregation;

/**
 * 接口原则一定要适度
 * 太细了实现麻烦
 * 太大了不能拆分成具体实现
 * <p>
 * 接口隔离侧重 对接口依赖的隔离
 * 单一职责 侧重于职责（功能）
 */
public class Dog implements ISwimAnimalAction, IEatAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}

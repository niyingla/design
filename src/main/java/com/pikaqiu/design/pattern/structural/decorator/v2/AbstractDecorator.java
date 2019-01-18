package com.pikaqiu.design.pattern.structural.decorator.v2;

/**
 * 抽象的煎饼装饰者类
 * @author xiaoye
 */
public abstract class AbstractDecorator extends ABattercake {
    /**
     * 被装饰的类
     */
    private ABattercake aBattercake;

    /**
     * 构造方法传入煎饼
     * @param aBattercake
     */
    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}

package com.pikaqiu.design.pattern.structural.decorator.v2;

/**
 * 香肠煎饼装饰着
 * @author xiaoye
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        System.out.println(1);
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}

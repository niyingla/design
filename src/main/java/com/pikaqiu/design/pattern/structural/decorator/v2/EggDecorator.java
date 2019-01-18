package com.pikaqiu.design.pattern.structural.decorator.v2;

/**
 * 鸡蛋煎饼装饰着
 * @author xiaoye
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    /**
     * 对方法进行增强
     * @return
     */
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    /**
     *  对方法进行增强
     * @return
     */
    @Override
    protected int cost() {
        return super.cost()+1;
    }
}

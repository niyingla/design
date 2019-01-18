package com.pikaqiu.design.pattern.structural.decorator.v2;

/**
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        //创建煎饼实例
        aBattercake = new Battercake();
        //鸡蛋装饰者 装饰 返回的是装时后的实例
        aBattercake = new EggDecorator(aBattercake);
        //鸡蛋装饰者 装饰 返回的是装时后的实例
        aBattercake = new EggDecorator(aBattercake);
        //香肠装饰者 装饰 返回的是装时后的实例
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}

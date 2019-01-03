package com.pikaqiu.design.principle.singleresponsibility;

/**
 * 类的单一职责原则  和 方法的单一职责类似
 * 为了保证解耦，和维护成本低 一个类或者接口最好就一个职责
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}

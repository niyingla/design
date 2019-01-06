package com.pikaqiu.design.pattern.creational.factorymethod;

/**
 * 工厂模式
 * 实现扩展方便
 * 只需添加VideoFactory继承类实现getVideo
 * 获取实际对应的需要的Video实践类即可
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}

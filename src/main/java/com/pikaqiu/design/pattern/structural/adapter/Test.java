package com.pikaqiu.design.pattern.structural.adapter;

/**
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        //创建五伏 电源适配器
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}

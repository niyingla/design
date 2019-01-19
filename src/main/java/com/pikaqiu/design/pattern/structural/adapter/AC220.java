package com.pikaqiu.design.pattern.structural.adapter;

/**
 * 被适配类
 * @author xiaoye
 */
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}

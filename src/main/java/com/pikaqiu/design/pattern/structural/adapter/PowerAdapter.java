package com.pikaqiu.design.pattern.structural.adapter;

/**
 * 适配器类
 * 实现相同接口 把现有结果适配成需要结果
 * 适配器实现类  还可以有10V 15V 20V适配器实现类
 * @author xiaoye
 */
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        //获取220伏电源
        int adapterInput = ac220.outputAC220V();
        //变压器...
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter 输入AC:"+adapterInput+"V"+" 输出DC:"+adapterOutput+"V");
        //输出五伏
        return adapterOutput;
    }
}

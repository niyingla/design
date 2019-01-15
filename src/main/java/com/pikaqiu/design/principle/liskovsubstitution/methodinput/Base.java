package com.pikaqiu.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author xiaoye
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}

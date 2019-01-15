package com.pikaqiu.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author xiaoye
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}

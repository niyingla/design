package com.pikaqiu.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式 类加载就生成
 */
public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


    /**
     * 禁止序列化与反序列化
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    /**
     * 防止克隆破坏
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}

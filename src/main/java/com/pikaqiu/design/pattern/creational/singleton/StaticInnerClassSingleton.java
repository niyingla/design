package com.pikaqiu.design.pattern.creational.singleton;

/**
 * 静态内部类方式
 * 延迟初始化
 */
public class StaticInnerClassSingleton {

    /**
     * 静态内部类 内初始化 单例实例
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /**
     * 静态方法被调用 满足初始化条件
     * @return
     */
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    /**
     * 私有构造器 防止被new
     */
    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}

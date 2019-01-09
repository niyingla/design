package com.pikaqiu.design.pattern.creational.singleton;

/**
 * 双重检查 懒汉式
 */
public class LazyDoubleCheckSingleton {
    //volatile 防止重排序初始化时 报错
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        //不再锁定获取方法  锁的开销很大 为空 初始化时才锁
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                //可能几个线程跳过空排序在锁那里等待 所以在此null判断
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //new 对象的机械步骤
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址有内存空间不为null但是注意此时对象还没初始化所以会报错
                    //2.初始化对象
//                    intra-thread semantics
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}

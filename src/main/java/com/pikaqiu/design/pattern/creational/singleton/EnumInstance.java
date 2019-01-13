package com.pikaqiu.design.pattern.creational.singleton;

/**
 * @author xiaoye
 * 枚举实现方法
 */
public enum EnumInstance {
    INSTANCE{
        @Override
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}

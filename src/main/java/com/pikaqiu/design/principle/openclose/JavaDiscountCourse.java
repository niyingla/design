package com.pikaqiu.design.principle.openclose;

/**
 * 开闭原则
 * 原来接口&实现类都没有变
 * 通过新增继承子类 完成业务实现
 * 闭源避免了修改基类和接口
 * 开放扩展 提高复用性
 *
 * 变化&修改的都是高层模块 底层接口和原来实现没有修改
 *
 * 继承原来课程类  然会新增实现方法 避免了修改原来的方法，提高复用性和可维护性
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}

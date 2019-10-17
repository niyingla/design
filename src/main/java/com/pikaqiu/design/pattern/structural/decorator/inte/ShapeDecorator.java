package com.pikaqiu.design.pattern.structural.decorator.inte;

/**
 * @program: design_pattern
 * @description: 装饰父类
 * @author: xiaoye
 * @create: 2019-10-17 16:09
 **/
public abstract class ShapeDecorator implements Shape {

  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape){
    this.decoratedShape = decoratedShape;
  }

  @Override
  public void draw(){
    decoratedShape.draw();
  }
}
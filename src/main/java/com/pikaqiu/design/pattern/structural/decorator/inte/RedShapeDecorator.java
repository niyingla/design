package com.pikaqiu.design.pattern.structural.decorator.inte;

/**
 * @program: design_pattern
 * @description:装饰实现类
 * @author: xiaoye
 * @create: 2019-10-17 16:10
 **/
public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder(decoratedShape);
  }

  private void setRedBorder(Shape decoratedShape){
    System.out.println("Border Color: Red");
  }
}
package com.pikaqiu.design.pattern.structural.facade.inte;

import com.pikaqiu.design.pattern.structural.decorator.inte.Shape;

/**
 * @program: design_pattern
 * @description:门面对象 和外界统一交互
 * @author: xiaoye
 * @create: 2019-10-17 16:45
 **/
public class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker() {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
  }

  public void drawCircle(){
    circle.draw();
  }
  public void drawRectangle(){
    rectangle.draw();
  }
  public void drawSquare(){
    square.draw();
  }
}
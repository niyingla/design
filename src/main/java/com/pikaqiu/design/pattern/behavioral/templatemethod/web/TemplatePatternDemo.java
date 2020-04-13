package com.pikaqiu.design.pattern.behavioral.templatemethod.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2020-04-13 11:42
 **/
public class TemplatePatternDemo {
  public static void main(String[] args) {

    Game game = new Cricket();
    game.play();
    System.out.println();
    game = new Football();
    game.play();
  }
}

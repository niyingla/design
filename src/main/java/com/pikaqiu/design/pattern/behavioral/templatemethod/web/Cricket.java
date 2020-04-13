package com.pikaqiu.design.pattern.behavioral.templatemethod.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2020-04-13 11:41
 **/
public class Cricket extends Game {

  @Override
  void endPlay() {
    System.out.println("Cricket Game Finished!");
  }

  @Override
  void initialize() {
    System.out.println("Cricket Game Initialized! Start playing.");
  }

  @Override
  void startPlay() {
    System.out.println("Cricket Game Started. Enjoy the game!");
  }
}

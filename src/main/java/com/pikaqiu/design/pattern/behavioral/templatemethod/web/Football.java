package com.pikaqiu.design.pattern.behavioral.templatemethod.web;

/**
 * @program: design_pattern
 * @description:
 * @author: xiaoye
 * @create: 2020-04-13 11:42
 **/
public class Football extends Game {
  @Override
  void endPlay() {
    System.out.println("Football Game Finished!");
  }

  @Override
  void initialize() {
    System.out.println("Football Game Initialized! Start playing.");
  }

  @Override
  void startPlay() {
    System.out.println("Football Game Started. Enjoy the game!");
  }
}

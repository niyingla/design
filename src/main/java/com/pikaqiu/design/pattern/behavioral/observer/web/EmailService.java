package com.pikaqiu.design.pattern.behavioral.observer.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * <p> EmailService </p>
 *
 * @author xiaoye
 * @version 1.0
 * @date 2020/11/18 11:42
 */
@Slf4j
@Service
public class EmailService implements ApplicationListener<UserRegisterEvent> {
  @Override
  public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
    log.info("收到用户注册事件");

    log.info("给{}用户，发送邮件", userRegisterEvent.getName());


  }
}

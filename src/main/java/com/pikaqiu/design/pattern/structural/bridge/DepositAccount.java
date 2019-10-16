package com.pikaqiu.design.pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 定期账号
 * @author xiaoye
 */
@Slf4j
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个定期账号");
    }
}

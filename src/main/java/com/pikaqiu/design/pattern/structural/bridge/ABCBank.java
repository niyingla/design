package com.pikaqiu.design.pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaoye
 */
@Slf4j
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        log.info("打开中国农业银行账号");
        //委托动作
        account.openAccount();
        return account;
    }
}

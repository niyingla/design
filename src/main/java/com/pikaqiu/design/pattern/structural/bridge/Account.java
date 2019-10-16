package com.pikaqiu.design.pattern.structural.bridge;

/**
 * @author xiaoye
 */
public interface Account {
    /**
     * 开户
     * @return
     */
    Account openAccount();

    /**
     * 展示账号类型
     */
    void showAccountType();

}

package com.pikaqiu.design.pattern.structural.bridge;

/**
 * @author xiaoye
 */
public abstract class Bank {
    protected Account account;

    /**
     * @param account
     */
    public Bank(Account account){
        this.account = account;
    }

    /**
     * 打开账户
     * @return
     */
    abstract Account openAccount();

}

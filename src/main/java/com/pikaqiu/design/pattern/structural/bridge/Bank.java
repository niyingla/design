package com.pikaqiu.design.pattern.structural.bridge;

/**
 * @author xiaoye
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}

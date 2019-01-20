package com.pikaqiu.design.pattern.structural.bridge;

/**
 * @author xiaoye
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //委托动作
        account.openAccount();
        return account;
    }
}

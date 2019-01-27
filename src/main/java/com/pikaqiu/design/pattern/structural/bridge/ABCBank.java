package com.pikaqiu.design.pattern.structural.bridge;

/**
 * @author xiaoye
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //委托动作
        account.openAccount();
        return account;
    }
}

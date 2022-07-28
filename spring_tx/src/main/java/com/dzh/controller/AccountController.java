package com.dzh.controller;

import com.dzh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 控制层
 */
@Controller
public class AccountController {

    private AccountService accountService;

    /**
     * 采用set方法注入依赖 自动注入
     * @param accountService 依赖项
     */
    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 转账 fromAccount 给 toAccount 转账 money
     * @param fromAccount 转出
     * @param toAccount 转入
     * @param money 金额
     */
    public void transfer(Integer fromAccount, Integer toAccount, Double money) {
        accountService.transfer(fromAccount,toAccount,money);
    }

}

package com.dzh.service.impl;

import com.dzh.mapper.AccountMapper;
import com.dzh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务实现
 */
@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    private AccountMapper accountMapper;

    /**
     * 采用set方法自动注入依赖
     * @param accountMapper 依赖项
     */
    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public void transfer(Integer fromAccount, Integer toAccount, Double money) {
        /*
            转出操作
         */
        accountMapper.transferOut(fromAccount,money);
        //设置异常测试
//        int i = 1/0;

        /*
        转入操作
         */
        accountMapper.transferIn(toAccount,money);

    }
}

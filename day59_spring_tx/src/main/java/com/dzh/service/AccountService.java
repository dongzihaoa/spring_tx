package com.dzh.service;

/**
 * 转账业务层接口
 */
public interface AccountService {

    void transfer(Integer fromAccount, Integer toAccount, Double money);
}

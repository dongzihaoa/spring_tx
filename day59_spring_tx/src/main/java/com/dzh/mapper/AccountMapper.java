package com.dzh.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * dao层接口
 */
public interface AccountMapper {
    /**
     * 转出操作
     * @param fromAccount 转出id
     * @param money 转账金额
     */
    void transferOut(@Param("fromAccountId") Integer fromAccount, @Param("money") Double money);

    void transferIn(@Param("toAccountId") Integer toAccount, @Param("money") Double money);

}

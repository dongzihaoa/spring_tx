package com.dzh.service;

/**
 * 用户接口
 */
public interface UserService {
    /**
     * 添加用户
     * 未增强的叫做连接点，已增强的叫做切入点
     */
    void addUser();

    /**
     * 删除用户
     * 未增强的叫做连接点，已增强的叫做切入点
     */
    void deleteUser();
}

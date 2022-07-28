package com.dzh.proxy.demo01;

/**
 * 房东
 */
public class LandLoad implements Rent{
    /**
     * 出租
     */
    public void rent() {
        System.out.println("房东出租");
    }

    /**
     * 测试方法
     */
    public void test() {
        System.out.println("测试方法");

    }
}

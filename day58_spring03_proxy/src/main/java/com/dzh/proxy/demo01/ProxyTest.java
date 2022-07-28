package com.dzh.proxy.demo01;

import org.junit.Test;

/**
 * ≤‚ ‘
 */
public class ProxyTest {
    @Test
    public void proxyTest() {

        LandLoad landLoad = new LandLoad();

        landLoad.test();
        landLoad.rent();

        System.out.println("-----------");

        JdkProxyRent jdkProxyRent = new JdkProxyRent();
        jdkProxyRent.setRent(landLoad);

        Rent rent = jdkProxyRent.creatRentProxy();
        rent.rent();

    }
}

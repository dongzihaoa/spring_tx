package com.dzh.proxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyRent implements InvocationHandler {

    private Rent rent;

    //set方法注入
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //创建代理对象
    public Rent creatRentProxy() {
        return (Rent) Proxy.newProxyInstance(
                rent.getClass().getClassLoader(), //类加载器
                rent.getClass().getInterfaces(),//接口列表
                this
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        /**
         *         筛选想要增强的方法，只增强接口或者接口实现类中的rent方法
         */
        if ("rent".equals(method.getName())){
            publish();
            seeHouse();
        }
        result = method.invoke(rent,args);

        return result;
    }

    /**
     * 流程：publish->seeHouse->房东
     */
    public void publish(){
        System.out.println("发布租房信息");
    }

    public void seeHouse(){
        System.out.println("带租户看房");
    }
}

package com.dzh.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 通知类 增强代码
 */
@Aspect
public class MyAdvice {

    /**
     * 自己设置一个切点，管理重复代码
     */
    @Pointcut("execution(public void com.dzh.service.impl.UserServiceImpl.addUser())")
    public void pc(){}

    @Pointcut("execution(public void com.dzh.service.impl.UserServiceImpl.deleteUser())")
    public void pc02(){}

    /**
     * 前置通知  多个切点用 || 连接
     */

    @Before("MyAdvice.pc() || MyAdvice.pc02()")
    public void before() {
        System.out.println("前置通知");
    }

    /**
     * 最终的后置通知，异常与否都会执行
     * 可直接写 也可写切入点 @Pointcut
     */
//    @After("execution(public void com.dzh.service.impl.UserServiceImpl.addUser())")
    @After("MyAdvice.pc() || MyAdvice.pc02()")
    public void after() {
        System.out.println("最终的后置通知，异常与否都会执行");
    }

    /**
     * 后置通知，发生异常不会被执行
     */
    @AfterReturning("MyAdvice.pc() || MyAdvice.pc02()")
    public void after_returning() {
        System.out.println("后置通知，发生异常不会被执行");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("MyAdvice.pc() || MyAdvice.pc02()")
    public void after_throwing() {
        System.out.println("出现异常 (异常通知,发生异常时候执行)");
    }

    /**
     *环绕通知
     */

    @Around("MyAdvice.pc() || MyAdvice.pc02()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕通知前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");

    }

}

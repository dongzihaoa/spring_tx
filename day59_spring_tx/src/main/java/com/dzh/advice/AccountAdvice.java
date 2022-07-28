package com.dzh.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AccountAdvice {

    /**
     * 自己设置一个切点，管理重复代码
     */
    @Pointcut("execution(public void com.dzh.service.impl.AccountServiceImpl.transfer())")
    public void pc(){}

    /**
     * 前置通知  多个切点用 || 连接
     */

    @Before("AccountAdvice.pc()")
    public void before() {
        System.out.println("--开始--");
    }

    /**
     * 最终的后置通知，异常与否都会执行
     * 可直接写 也可写切入点 @Pointcut
     */
//    @After("execution(public void com.dzh.service.impl.UserServiceImpl.addUser())")
//    @After("AccountAdvice.pc()")
    public void after() {
        System.out.println("----");
    }

    /**
     * 后置通知，发生异常不会被执行
     */
//    @AfterReturning("AccountAdvice.pc()")
    public void after_returning() {
        System.out.println("转账成功！");
    }

    /**
     * 异常通知
     */
//    @AfterThrowing("AccountAdvice.pc()")
    public void after_throwing() {
        System.out.println("转账失败");
    }

    /**
     *环绕通知
     */

//    @Around("AccountAdvice.pc()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("开始转账");
        System.out.println("......");
        proceedingJoinPoint.proceed();
        System.out.println("转账成功");

    }

}

package com.kai.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Kai Wang
 * @Date: 03/25/20 13:42
 */
@Component("logginAspectJ")
@Aspect
public class ArithmeticAspectJ {

    /*
     *定义一个方法,用于声明切点表达式,该方法一般没有方法体
     *@Pointcut用来声明切点表达式
     *通知直接使用定义的方法名即可引入当前的切点表达式
     */
    @Pointcut("execution(* com.mmall.spring.aop.*(..))")
    public void pointcutDeclaration() {}

    //前置通知,方法执行之前执行
    @Before("pointcutDeclaration()")
    public void BeforeMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("BeforeMethod  The method   " + methodName + "   parameter is  " + Arrays.asList(args));
        System.out.println("add before");
    }

    //后置通知,方法执行之后执行(不管是否发生异常)
    @After("pointcutDeclaration()")
    public void afterMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterMethod  The method    "+ methodName +"   parameter is  "+Arrays.asList(args));
    }

    //返回通知,方法正常执行完毕之后执行
    @AfterReturning(value="pointcutDeclaration()", returning="result")
    public void afterReturningMethod(JoinPoint jp,Object result) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterReturningMethod  The method   "+ methodName +"   parameter is  "+Arrays.asList(args)+" "+result);
    }

    //异常通知,在方法抛出异常之后执行
    @AfterThrowing(value="pointcutDeclaration()", throwing="e")
    public void afterThrowingMethod(JoinPoint jp,Exception e) {
        String methodName = jp.getSignature().getName();
        System.out.println("AfterThrowingMethod  The method   "+ methodName +"exception :"+e);
    }
}
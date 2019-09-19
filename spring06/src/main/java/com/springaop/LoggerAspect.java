package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author changyu
 * @version V1.0
 * @Package com.springaop
 * @date 2019-09-19 16:30
 * @Copyright 北京木联能软件股份有限公司
 */
@Aspect
@Component
public class LoggerAspect {

    @Before("execution(public int com.springaop.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取参数
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"的参数是"+args);
    }
    
    
    @Before("execution(public int com.springaop.CalImpl.*(..))")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法结束");
    }
    @AfterReturning(value = "execution(public int com.springaop.CalImpl.*(..))",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是"+result);

    }
    @AfterThrowing(value = "execution(public int com.springaop.CalImpl.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出异常"+ex);
    }
}

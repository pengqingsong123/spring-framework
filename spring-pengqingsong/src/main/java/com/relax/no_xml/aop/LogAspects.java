package com.relax.no_xml.aop;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;


@Aspect
public class LogAspects {

    @Pointcut("execution(public ** com.relax.no_xml.service.HelloService.*(..))")
    public void pointCut() {
    }

    ;

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("aop的前置通知方法before执行, 方法执行参数{" + Arrays.asList(args) + "}");
    }

    @After("com.relax.no_xml.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("aop的后置通知方法after执行,方法名:" + joinPoint.getSignature().getName() + "");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("aop的环绕方法AfterReturning执行,方法名:" + joinPoint.getSignature().getName() + "result{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("aop的异常通知AfterThrowing执行,方法名:" + joinPoint.getSignature().getName() + "AfterThrowing信息:" + exception + "}");
    }

}

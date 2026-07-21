package com.library.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around("execution(* com.library.Service.BookService.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long st=System.currentTimeMillis();
        Object obj=joinPoint.proceed();
        long en=System.currentTimeMillis();
        System.out.println("Method:"+joinPoint.getSignature().getName());
        System.out.println("Execution Time:"+(en-st)+" ms");
        return obj;
    }
}
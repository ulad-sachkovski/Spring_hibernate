package com.vsachkovsky.spring_project_v1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* say())")
    public Object aroundPetSayingLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AroundPetSayingLoggingAdvice: " + "pet is going to answer:");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("AroundPetSayingLoggingAdvice: " + "pet has successfully answered to owner!");
        return targetMethodResult;
    }
}

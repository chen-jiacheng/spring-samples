package com.chenjiacheng.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by chenjiacheng on 2024/7/6 01:17
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Aspect
public class CustomAspect {

    @Around("execution(public * com.chenjiacheng.spring.aop.service.*.*(..))")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        Object retVal = pjp.proceed();
        // stop stopwatch
        return retVal;
    }

}

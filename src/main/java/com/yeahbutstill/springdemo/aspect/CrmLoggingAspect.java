package com.yeahbutstill.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CrmLoggingAspect {

    // setup logger
    private final Logger logger = Logger.getLogger(getClass().getName());

    // setup pointcut declarations
    @Pointcut("execution(* com.yeahbutstill.springdemo.controller.*.*(..))")
    public void forControllerPackage() {
        // TODO document why this method is empty
    }

    // do the same for service and dao
    @Pointcut("execution(* com.yeahbutstill.springdemo.service.*.*(..))")
    public void forServicePackage() {
        // TODO document why this method is empty
    }

    @Pointcut("execution(* com.yeahbutstill.springdemo.dao.*.*(..))")
    public void forDaoPackage() {
        // TODO document why this method is empty
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    public void forAppFlow() { /* TODO document why this method is empty */ }

    // add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {

        // display method we are calling
        String theMethod = joinPoint.getSignature().toLongString();
        logger.info("======>>> in @Before: calling method: " + theMethod);

        // display the arguments to the method
        // get the arguments
        Object[] args = joinPoint.getArgs();

        // loop thru and display args
        for (Object tempArg : args) {
            logger.info("=====>> argument: " + tempArg);
        }

    }

    // add @AfterReturning advice
    @AfterReturning(
            pointcut="forAppFlow()",
            returning="theResult"
    )
    public void afterReturning(JoinPoint theJoinPoint, Object theResult) {

        // display method we are returning from
        String theMethod = theJoinPoint.getSignature().toShortString();
        logger.info("=====>> in @AfterReturning: from method: " + theMethod);

        // display data returned
        logger.info("=====>> result: " + theResult);

    }

}

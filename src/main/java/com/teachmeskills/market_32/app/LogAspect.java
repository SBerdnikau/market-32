package com.teachmeskills.market_32.app;

import com.teachmeskills.market_32.annotation.LoggerAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class LogAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Before("@annotation(loggerAnnotation)")
    public void logBefore(JoinPoint joinPoint, LoggerAnnotation loggerAnnotation) {
        LOGGER.info(new Date() + " INFO IN:  {}", joinPoint.getSignature().getName());
    }

    @After("@annotation(loggerAnnotation)")
    public void logAfter(JoinPoint joinPoint, LoggerAnnotation loggerAnnotation) {
        LOGGER.info(new Date() + " INFO OUT: {}", joinPoint.getSignature().getName());
    }

    @AfterThrowing(value = "@annotation(loggerAnnotation)", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, LoggerAnnotation loggerAnnotation , Exception e) {
        LOGGER.info(new Date() + " ERROR:  {}", joinPoint.getSignature().getName() + " -> " + e.getMessage());
    }

}

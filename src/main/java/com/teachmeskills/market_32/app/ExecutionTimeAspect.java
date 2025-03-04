package com.teachmeskills.market_32.app;

import com.teachmeskills.market_32.annotation.ExecutionTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExecutionTimeAspect.class);

    @Around("@annotation(executionTime)")
    public Object executionTimeAspect(ProceedingJoinPoint joinPoint, ExecutionTime executionTime) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long excecutionTime = System.currentTimeMillis() - startTime;

        if (excecutionTime < 1000){
            LOGGER.info(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + " executed in " + excecutionTime + " ms");
        }else {
            LOGGER.warn(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + " executed in " + excecutionTime + " ms");
        }

        return proceed;
    }

}

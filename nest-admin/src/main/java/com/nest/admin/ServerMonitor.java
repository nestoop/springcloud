package com.nest.admin;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Component;

/**
 * @author botter
 */
@Aspect
@Component
public class ServerMonitor {

    @Autowired
    private CounterService counterService;
    @Autowired
    private GaugeService gaugeService;

    /**
     * 使用aop 统计调用次数
     * @param joinPoint
     */
    @Before("execution(* com.nest.admin.*.*(..))")
    public void countServiceInvoker(JoinPoint joinPoint) {
        System.out.println("[AOP] signature = " + joinPoint.getSignature());
        counterService.increment(joinPoint.getSignature() + "");
    }

    /**
     * 获取调用接口时间
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around("execution(* com.nest.admin.*.*(..))")
    public void latencyService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[AOP] used call method time " + (end - start) + ", signature = " + proceedingJoinPoint.getSignature());
        gaugeService.submit(proceedingJoinPoint.getSignature().toLongString(), end - start);
    }

}

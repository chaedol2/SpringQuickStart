package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//XML 방식
//public class AroundAdvice {
//	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
//		String method = pjp.getSignature().getName();
//		
////		System.out.println("[BEFORE]: 비즈니스 메소드 수행 전에 처리할 내용...");
////		Object returnObj = pjp.proceed();
////		System.out.println("[AFTER]: 비즈니스 메소드 수행 후에 처리할 내용...");
////		return returnObj;
//		
//		StopWatch stopWatch = new StopWatch();
//		stopWatch.start();
//		
//		Object obj = pjp.proceed();
//		
//		stopWatch.stop();
//		System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
//		
//		return obj;
//	}
//}

//어노테이션 방식
@Service
@Aspect
public class AroundAdvice {
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {};
	
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		
//		System.out.println("[BEFORE]: 비즈니스 메소드 수행 전에 처리할 내용...");
//		Object returnObj = pjp.proceed();
//		System.out.println("[AFTER]: 비즈니스 메소드 수행 후에 처리할 내용...");
//		return returnObj;
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object obj = pjp.proceed();
		
		stopWatch.stop();
		System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		
		return obj;
	}
}
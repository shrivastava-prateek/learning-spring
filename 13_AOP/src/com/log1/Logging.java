package com.log1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
@Pointcut("execution(* com.log1.*.add(..))")
private void selectAll_1(){
	
}
@After("selectAll_1()")
public void afterAdvice(){
	System.out.println("Student profile has been already setup.");
}
@AfterReturning(pointcut="selectAll_1()",returning="retVal")
 public void afterReturningAdvice(Object retVal){
	System.out.println("Returning:" + retVal.toString());
}

@Around("selectAll_1()")
public void aroundAdvice(ProceedingJoinPoint joinpoint){
	
		
		try {
			System.out.println("invoking before the around advice");
			joinpoint.proceed();
			System.out.println("After advised method");
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		
	
}
}

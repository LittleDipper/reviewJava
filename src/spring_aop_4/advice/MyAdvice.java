package spring_aop_4.advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//表示这个该类是一个通知类
@Aspect
@Component
//通知类
public class MyAdvice {
	
	//前置通知	
//		|-目标方法运行之前调用
	//后置通知(如果出现异常不会调用)
//		|-在目标方法运行之后调用
	//环绕通知
//		|-在目标方法之前和之后都调用
	//异常拦截通知
//		|-如果出现异常,就会调用
	//后置通知(无论是否出现 异常都会调用)
//		|-在目标方法运行之后调用
//----------------------------------------------------------------
	
	
	@Pointcut("execution(* spring_aop_4.service.impl.*ServiceImpl.*(..))")
	public void pc(){}
	
	//前置通知 指定该方法是前置通知，并指定切入点
	@Before("MyAdvice.pc()")
	public void before(){
		System.out.println("这是前置通知!!");
	}
	//后置通知
	@AfterReturning("execution(* spring_aop_4.service.impl.*ServiceImpl.*(..))")
	public void afterReturning(){
		System.out.println("这是后置通知(如果出现异常不会调用)!!");
	}
	//环绕通知
	@Around("execution(* spring_aop_4.service.impl.*ServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("这是环绕通知之前的部分!!");
		Object proceed = pjp.proceed();//调用目标方法
		System.out.println("这是环绕通知之后的部分!!");
		return proceed;
	}
	//异常通知
	@AfterThrowing("execution(* spring_aop_4.service.impl.*ServiceImpl.*(..))")
	public void afterException(){
		System.out.println("出事啦!出现异常了!!");
	}
	//后置通知
	@After("execution(* spring_aop_4.service.impl.*ServiceImpl.*(..))")
	public void after(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println("-------"+name);
		System.out.println("这是后置通知(出现异常也会调用)!!");
	}
}


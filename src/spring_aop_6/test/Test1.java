package spring_aop_6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop_6.controller.AccountController;

public class Test1 {

	@Test
	public void fun1(){
		
		//得到容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop_6/applicationContext.xml");
		
		//从容器中得到Controller层的对象
		AccountController accountController = (AccountController) ac.getBean("accountController");
		
		//测试转账操作
		accountController.zhuangZhang();
	}
}

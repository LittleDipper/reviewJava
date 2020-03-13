package spring_aop_4.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop_4.controller.UserController;
import spring_aop_4.service.UserService;


public class Test1 {
	
	@Test
	public void fun1(){
		//1,得到容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop_4/applicationContext.xml");
		
		//2,从容器中哪所需对象
		UserController userController = (UserController) ac.getBean("userController");
		
		UserService userService = (UserService) ac.getBean("userService");
		System.out.println(userService.getClass().getName());
		
		//3.测试
		System.out.println(userController);
		userController.fun1();
	}
}

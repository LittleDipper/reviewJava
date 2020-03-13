package spring_aop_5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop_5.controller.UserController;


public class Test1 {
	
	@Test
	public void fun1(){
		//1,得到容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop_5/applicationContext.xml");
		
		//2,从容器中哪所需对象(此处得到Controller层的对象)
		UserController userController = (UserController) ac.getBean("userController");
		
		//3.测试(此处就是Controller层调用Service层的方法)
		System.out.println(userController);
		userController.fun6();
	}
}

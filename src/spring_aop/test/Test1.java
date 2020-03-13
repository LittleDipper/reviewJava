package spring_aop.test;

import org.junit.Test;

import spring_aop.controller.UserController;

public class Test1 {
	
	@Test
	public void fun1(){
		
		//1.得到Controller层的对象
	    UserController userController = new UserController();
		//2.测试
		System.out.println(userController);
		userController.fun1();
	}
}

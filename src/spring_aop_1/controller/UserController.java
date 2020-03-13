package spring_aop_1.controller;

import org.junit.Test;

import spring_aop.service.UserService;
import spring_aop.service.impl.UserServiceImpl;

public class UserController {
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void fun1(){
		userService.add();
	}
}

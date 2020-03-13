package spring_aop.controller;

import spring_aop.service.UserService;
import spring_aop.service.impl.UserServiceImpl;

public class UserController {
	
	private UserService userService = new UserServiceImpl();
	
	public void fun1(){
		userService.add();
	}
}

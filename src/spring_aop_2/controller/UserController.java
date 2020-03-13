package spring_aop_2.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring_aop_2.service.UserService;

@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void fun1(){
		userService.add();
	}
}

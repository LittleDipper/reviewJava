package spring_aop_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring_aop_4.service.UserService;

@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void fun1(){
		userService.add();
	}
}

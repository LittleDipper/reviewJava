package spring_aop_5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring_aop_5.bean.User;
import spring_aop_5.service.UserService;

@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	public void fun1(){
		System.out.println("-----------");
		User u = new User(11, "Marry");
		//测试增加用户
		userService.save(u);
		System.out.println("-----------");
	}
	
	public void fun2(){
		//测试删除用户
		userService.delete(18);
	}
	
	public void fun3(){
		//测试更新用户
		User u = new User(11, "Marry");
		userService.update(u);
	}
	
	public void fun4(){
		//查询用户
		User user = userService.getById(10);
		System.out.println(user);
	}
	
	public void fun5(){
		//查询用户数
		int userCount = userService.getTotalCount();
		System.out.println(userCount);
	}
	
	public void fun6(){
		//查询所有用户
		List<User> list = userService.getAll();
		
		//遍历List集合
		//1,普通for集合
		for(int i = 0;i<list.size();i++){
			User user = list.get(i);
			System.out.println(user);
		}
	}
}

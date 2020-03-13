package spring_aop_3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_aop_3.dao.UserDao;
import spring_aop_3.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void add() {
		System.out.println("service层添加用户...");
		userDao.save();
	}

}

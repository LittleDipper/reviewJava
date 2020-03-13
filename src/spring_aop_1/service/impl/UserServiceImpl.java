package spring_aop_1.service.impl;

import spring_aop.dao.UserDao;
import spring_aop.dao.impl.UserDaoImpl;
import spring_aop.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add() {
		System.out.println("service层添加用户...");
		userDao.save();
	}

}

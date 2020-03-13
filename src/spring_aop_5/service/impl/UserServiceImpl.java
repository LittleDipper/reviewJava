package spring_aop_5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_aop_5.bean.User;
import spring_aop_5.dao.UserDao;
import spring_aop_5.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void save(User u) {
		userDao.save(u);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public void update(User u) {
		userDao.update(u);
	}

	@Override
	public User getById(Integer id) {
		return userDao.getById(id);
	}

	@Override
	public int getTotalCount() {
		return userDao.getTotalCount();
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}


}

package spring_aop_3.dao.impl;

import org.springframework.stereotype.Repository;

import spring_aop_3.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("保存至数据库...");
	}

}

package spring_aop_1.dao.impl;

import spring_aop.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("保存至数据库...");
	}

}

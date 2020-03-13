package spring_aop.dao.impl;

import spring_aop.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("dao层把用户保存至数据库...");
	}

}

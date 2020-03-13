package spring_aop_5.service;

import java.util.List;

import spring_aop_5.bean.User;

public interface UserService {
	//增
	void save(User u);
	//删
	void delete(Integer id);
	//改
	void update(User u);
	//查单个对象
	User getById(Integer id);
	//查总的数量
	int getTotalCount();
	//查多个对象
	List<User> getAll();
}

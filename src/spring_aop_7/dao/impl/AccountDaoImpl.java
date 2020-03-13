package spring_aop_7.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import spring_aop_7.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void increaseMoney(Integer id, double money) {
		//创建sql语句
		String sql = "update t_account set money = money + ? where id = ?";
		//执行sql语句
		super.getJdbcTemplate().update(sql, money,id);
	}

	@Override
	public void decreaseMoney(Integer id, double money) {
		String sql = "update t_account set money = money - ? where id = ?";
		super.getJdbcTemplate().update(sql, money,id);
	}

}

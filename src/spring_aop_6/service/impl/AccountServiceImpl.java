package spring_aop_6.service.impl;

import spring_aop_6.dao.AccountDao;
import spring_aop_6.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(Integer from, Integer to, double money) {
		
		//给账户减钱
		accountDao.decreaseMoney(from, money);
		
		//在转账的过程中出现了异常
//		int i = 1/0;
		
		//给账户加钱
		accountDao.increaseMoney(to, money);
		
		
		
		
	}

}

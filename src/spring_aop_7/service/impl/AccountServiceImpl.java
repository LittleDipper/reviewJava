package spring_aop_7.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring_aop_7.dao.AccountDao;
import spring_aop_7.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Resource(name="accountDao")
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

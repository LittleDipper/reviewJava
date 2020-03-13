package spring_aop_6.controller;

import spring_aop_6.service.AccountService;

public class AccountController {
	
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	//这个方法内部调用Service层的转账方法，实现转账操作
	public void zhuangZhang(){
		accountService.transfer(1, 2, 100);
	}
}

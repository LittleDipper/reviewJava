package spring_aop_7.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import spring_aop_7.service.AccountService;

@Controller("accountController")
public class AccountController {
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	//这个方法内部调用Service层的转账方法，实现转账操作
	public void zhuangZhang(){
		accountService.transfer(1, 2, 100);
	}
}

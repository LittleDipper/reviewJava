package spring_aop_6.service;

public interface AccountService {
	//转账
	void transfer(Integer from,Integer to,double money);
}

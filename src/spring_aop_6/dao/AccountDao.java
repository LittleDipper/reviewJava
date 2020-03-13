package spring_aop_6.dao;

public interface AccountDao {
	
	//加钱
	void increaseMoney(Integer id,double money);
	//减钱
	void decreaseMoney(Integer id,double money);
}

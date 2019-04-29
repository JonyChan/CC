package Dao;

import entity.BankUser;

public interface BankUserDao {
	
	public BankUser updatebalance(String balance);
	public BankUser updatebankpassword(String name, String bankpwd);
	

}

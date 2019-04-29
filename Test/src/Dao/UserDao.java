package Dao;

import entity.user;

public interface UserDao {

	public user selectByNameAndPwd(String name,String pwd);

	public user insert(user u);

	public user selectByName(String name);
	
	public void changePassword(user u);
}

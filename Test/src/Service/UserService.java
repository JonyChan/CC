package Service;

import entity.user;

public interface UserService {

	public boolean login(String name,String pwd);
	public void regist(user u);
	boolean check(String name);
	public void changePassword(user u);
}

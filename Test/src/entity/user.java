package entity;

public class user {

	private String name;
	private String password;
	private String money;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String name, String password, String money) {
		super();
		this.name = name;
		this.password = password;
		this.money = money;
	}
	
	public user(String name,String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", password=" + password + ", money=" + money + "]";
	}
	
	

}

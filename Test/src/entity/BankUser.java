package entity;

public class BankUser {
	
	private String name;
	private String password;
	private String money;
	private String major;
	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankUser(String name, String password, String money, String major) {
		super();
		this.name = name;
		this.password = password;
		this.money = money;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "users [ name=" + name + ", password="
				+ password + ", major = "+ major +", money = "+ money +"]";
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
	
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
}

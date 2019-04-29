package entity;

public class NameCheck {
	
private String name;
	
	public NameCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NameCheck(String name) {
		super();
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return "name [ name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

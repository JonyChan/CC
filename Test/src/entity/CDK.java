package entity;

public class CDK {
	
	private String cdk;
	
	public CDK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CDK(String cdk) {
		super();
		this.cdk = cdk;
		
	}
	
	@Override
	public String toString() {
		return "cdk [ cdk=" + cdk + "]";
	}
	
	public String getCdk() {
		return cdk;
	}
	public void setCdk(String cdk) {
		this.cdk = cdk;
	}
	
	

}

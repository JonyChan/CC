package entity;

public class app {
	private String appname;
	private String appdescri;
	private String provider;
	
	public app(String appname, String appdescri, String provider) {
		super();
		this.appname = appname;
		this.appdescri = appdescri;
		
		this.provider = provider;
	}
	public app() {
		super();
		// TODO Auto-generated constructor stub
	}
	public app(String appname, String appdescri) {
		super();
		this.appname = appname;
		this.appdescri = appdescri;
		
	}
	
	
	

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getAppdescri() {
		return appdescri;
	}

	public void setAppdescri(String appdescri) {
		this.appdescri = appdescri;
	}


	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "app [appname=" + appname + ", appdescri=" + appdescri + ", provider=" + provider + "]";
	}

	
	
	
	

}

package entity;

public class app {
	private String appname;
	private String appdescri;
	private String warpath;
	private String iconpath;
	private String provider;
	
	public app(String appname, String appdescri, String warpath, String iconpath, String provider) {
		super();
		this.appname = appname;
		this.appdescri = appdescri;
		this.warpath = warpath;
		this.iconpath = iconpath;
		this.provider = provider;
	}
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
	
	
	
	public app(String appname, String appdescri, String warpath, String iconpath) {
		super();
		this.appname = appname;
		this.appdescri = appdescri;
		this.warpath = warpath;
		this.iconpath = iconpath;
		
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

	public String getWarpath() {
		return warpath;
	}

	public void setWarpath(String warpath) {
		this.warpath = warpath;
	}

	public String getIconpath() {
		return iconpath;
	}

	public void setIconpath(String iconpath) {
		this.iconpath = iconpath;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "app [appname=" + appname + ", appdescri=" + appdescri + ", warpath=" + warpath + ", iconpath="
				+ iconpath + ", provider=" + provider + "]";
	}
	
	
	
	

}

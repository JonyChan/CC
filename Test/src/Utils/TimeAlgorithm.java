package Utils;

import java.util.Calendar;

public class TimeAlgorithm {
	public int getNum() {
		RandNum r = new RandNum();
		Calendar cal = Calendar.getInstance();
		int hour_now = cal.get(Calendar.HOUR_OF_DAY);
		int rn = 0;
		if(hour_now==0) {
			rn = r.rand(30,90);
		}
		else if(hour_now==1) {
			rn = r.rand(60, 90); 
		}
		else if(hour_now==2) {
			rn = r.rand(10, 60); 
		}
		else if(hour_now==3) {
			rn = r.rand(0, 10); 
		}
		else if(hour_now==4) {
			rn = r.rand(0, 6); 
		} 
		else if(hour_now==5) {
			rn = r.rand(0, 10); 		
		} 
		else if(hour_now==6){
			rn = r.rand(10, 40); 
		}
		else if(hour_now==7){
			rn = r.rand(40, 150); 
		}
		else if(hour_now==8) {
			rn = r.rand(150, 360); 
		}
		else if(hour_now==9) {
			rn = r.rand(360, 600); 
		}
		else if(hour_now==10) {
			rn = r.rand(600, 750); 
		}
		else if(hour_now==11) {
			rn = r.rand(600, 750); 
		}
		else if(hour_now==12) {
			rn = r.rand(750, 1200); 
		}
		else if(hour_now==13) {
			rn = r.rand(760, 1400); 
		}
		else if(hour_now==14) {
			rn = r.rand(450, 760); 
		}
		else if(hour_now==15) {
			rn = r.rand(750, 1050); 
		}
		else if(hour_now==16) {
			rn = r.rand(600, 900); 
		}
		else if(hour_now==17) {
			rn = r.rand(450, 750); 
		}
		else if(hour_now==18) {
			rn = r.rand(400, 700); 
		}
		else if(hour_now==19) {
			rn = r.rand(400, 600); 
		}
		else if(hour_now==20) {
			rn = r.rand(400, 900); 
		}
		else if(hour_now==21) {
			rn = r.rand(300, 800); 
		}
		else if(hour_now==22) {
			rn = r.rand(160, 500); 
		}
		else if(hour_now==23) {
			rn = r.rand(80, 160); 
		}
		return rn;
	}
}

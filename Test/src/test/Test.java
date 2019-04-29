package test;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String [] args) {
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		System.out.println(time);
	}
}
